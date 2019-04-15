package br.com.fiap.andromeda.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(ComodoItemEletronicoPK.class)
@Table(name="t_comodo_item_eletronico")
public class ComodoItemEletronico implements Serializable {
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_comodo")
	private Comodo cdComodo;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_item_eletronico")
	private ItemEletronico cdItemEletronico;

	@Id
	@Column(name="cd_comodo_item_eletronico")
	private int cdComodoItemEletronico;
	
	@Column(name="qt_tempo_uso",nullable=false)
	private int qtTempoUso;

	public ComodoItemEletronico() {
		super();
	}

	public ComodoItemEletronico(Comodo cdResidencia, Comodo cdComodo, ItemEletronico cdItemEletronico,
			int cdComodoItemEletronico, int qtTempoUso) {
		super();
		this.cdComodo = cdComodo;
		this.cdItemEletronico = cdItemEletronico;
		this.cdComodoItemEletronico = cdComodoItemEletronico;
		this.qtTempoUso = qtTempoUso;
	}

	public Comodo getCdComodo() {
		return cdComodo;
	}

	public void setCdComodo(Comodo cdComodo) {
		this.cdComodo = cdComodo;
	}

	public ItemEletronico getCdItemEletronico() {
		return cdItemEletronico;
	}

	public void setCdItemEletronico(ItemEletronico cdItemEletronico) {
		this.cdItemEletronico = cdItemEletronico;
	}

	public int getCdComodoItemEletronico() {
		return cdComodoItemEletronico;
	}

	public void setCdComodoItemEletronico(int cdComodoItemEletronico) {
		this.cdComodoItemEletronico = cdComodoItemEletronico;
	}

	public int getQtTempoUso() {
		return qtTempoUso;
	}

	public void setQtTempoUso(int qtTempoUso) {
		this.qtTempoUso = qtTempoUso;
	}

}
