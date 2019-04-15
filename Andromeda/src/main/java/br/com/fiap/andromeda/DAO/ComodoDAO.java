package br.com.fiap.andromeda.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.Comodo;

public class ComodoDAO extends GenericDAO<Comodo, Integer> {

	public ComodoDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}

}
