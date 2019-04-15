package br.com.fiap.andromeda.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.ItemEletronico;

public class ItemEletronicoDAO extends GenericDAO<ItemEletronico, Integer> {

	public ItemEletronicoDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}

}
