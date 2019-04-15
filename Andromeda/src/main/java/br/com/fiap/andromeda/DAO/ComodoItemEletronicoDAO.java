package br.com.fiap.andromeda.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.ComodoItemEletronico;
import br.com.fiap.andromeda.entity.ComodoItemEletronicoPK;

public class ComodoItemEletronicoDAO extends GenericDAO<ComodoItemEletronico, ComodoItemEletronicoPK> {

	public ComodoItemEletronicoDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}

}
