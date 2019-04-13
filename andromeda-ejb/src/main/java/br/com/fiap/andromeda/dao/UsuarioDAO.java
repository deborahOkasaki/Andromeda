package br.com.fiap.andromeda.dao;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer>{

	public UsuarioDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}

}
