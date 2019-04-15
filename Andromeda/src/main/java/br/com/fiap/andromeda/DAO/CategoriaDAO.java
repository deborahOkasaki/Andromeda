package br.com.fiap.andromeda.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria, Integer> {

	public CategoriaDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}
	
}
