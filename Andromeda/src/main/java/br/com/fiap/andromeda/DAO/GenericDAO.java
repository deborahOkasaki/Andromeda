package br.com.fiap.andromeda.DAO;

import javax.persistence.EntityManager;
import java.lang.reflect.*;
import java.util.List; 

public class GenericDAO<T, K> {

	protected EntityManager GerenciadorEntidade;

	private Class<T> clazz; 
	
	public GenericDAO(EntityManager GerenciadorEntidade) {
		this.GerenciadorEntidade = GerenciadorEntidade;
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void inserir (T entidade) {
		GerenciadorEntidade.persist(entidade);
	}
	
	public void atualizar (T entidade) {
		GerenciadorEntidade.merge(entidade);
	}
	
	public T buscar (K chave) {
		return GerenciadorEntidade.find(clazz, chave);
	}
	
	public void deletar (K chave) throws Exception {
		T entidade = buscar(chave);
		if (entidade == null) {
			throw new Exception("Entidade não encontrada");			
		}
		GerenciadorEntidade.remove(entidade);
	}
	
	public List<T> listar () {
		return GerenciadorEntidade.createQuery("from " + clazz.getName()).getResultList();
	}
	
	public void commit() throws Exception {
		try {
		GerenciadorEntidade.getTransaction().begin();
		GerenciadorEntidade.getTransaction().commit();
		} catch (Exception e) {
			if (GerenciadorEntidade.getTransaction().isActive())
				GerenciadorEntidade.getTransaction().rollback();
			throw new Exception("Erro no commit");
		}
	}
	
	
	
	
	
}
