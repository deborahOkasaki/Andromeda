package br.com.fiap.andromeda.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.Residencia;

public class ResidenciaDAO extends GenericDAO<Residencia, Integer>{

	public ResidenciaDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}
	
}
