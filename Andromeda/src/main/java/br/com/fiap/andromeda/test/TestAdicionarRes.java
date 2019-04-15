package br.com.fiap.andromeda.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.andromeda.DAO.ResidenciaDAO;
import br.com.fiap.andromeda.DAO.UsuarioDAO;
import br.com.fiap.andromeda.DAO.UsuarioResidenciaDAO;
import br.com.fiap.andromeda.entity.Residencia;
import br.com.fiap.andromeda.entity.Usuario;
import br.com.fiap.andromeda.entity.UsuarioResidencia;

/**
 * Teste: Adição de uma residência no contexto de um usuário
 * @author christine
 * @version 1.0
 */
public class TestAdicionarRes {
	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("Andromeda").createEntityManager();
			
			//Usuário em contexto:
			UsuarioDAO uDAO = new UsuarioDAO(em);
			Usuario user = uDAO.buscar(1);
			System.out.println(user.getAll());
			
			//Criação da residência
			Residencia res = new Residencia("Blau", 3);
			
			ResidenciaDAO rDAO = new ResidenciaDAO(em);
			rDAO.inserir(res);
			rDAO.commit();

			//Criação da residência acoplada ao contexto do usuario
			UsuarioResidencia ur = new UsuarioResidencia(user, res, 2);
			UsuarioResidenciaDAO urDAO = new UsuarioResidenciaDAO(em);
			urDAO.inserir(ur);
			urDAO.commit();
			
			//Retorno do relacionamento criado:
			
			System.out.println(ur.getAll());
			
		}catch(Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			if(em != null) {
				em.close();
			}
			System.exit(0);
		}
	}
}
