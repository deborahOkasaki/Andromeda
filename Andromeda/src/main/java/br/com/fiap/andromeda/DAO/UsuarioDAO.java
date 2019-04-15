package br.com.fiap.andromeda.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer>{

	public UsuarioDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}

}
