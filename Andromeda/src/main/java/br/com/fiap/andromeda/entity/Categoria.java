package br.com.fiap.andromeda.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_categoria")
public class Categoria {
	
	@Id
	@SequenceGenerator(name="categoria", sequenceName="sq_tb_categoria", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="categoria")
	@Column(name="cd_categoria")
	private int cdCategoria;
	
	@Column(name="nm_categoria",nullable=false,length=20)
	private String nmCategoria; 
	
	@Column(name="ds_categoria",nullable=true,length=255)
	private String dsCategoria;
	
	@OneToMany(mappedBy="cdCategoria")
	private List<ItemEletronico> cdItemEletronico;

	public Categoria() {
		super();
	}

	public Categoria(int cdCategoria, String nmCategoria, String dsCategoria, List<ItemEletronico> cdItemEletronico) {
		super();
		this.cdCategoria = cdCategoria;
		this.nmCategoria = nmCategoria;
		this.dsCategoria = dsCategoria;
		this.cdItemEletronico = cdItemEletronico;
	}

	public int getCdCategoria() {
		return cdCategoria;
	}

	public void setCdCategoria(int cdCategoria) {
		this.cdCategoria = cdCategoria;
	}

	public String getNmCategoria() {
		return nmCategoria;
	}

	public void setNmCategoria(String nmCategoria) {
		this.nmCategoria = nmCategoria;
	}

	public String getDsCategoria() {
		return dsCategoria;
	}

	public void setDsCategoria(String dsCategoria) {
		this.dsCategoria = dsCategoria;
	}

	public List<ItemEletronico> getCdItemEletronico() {
		return cdItemEletronico;
	}

	public void setCdItemEletronico(List<ItemEletronico> cdItemEletronico) {
		this.cdItemEletronico = cdItemEletronico;
	}
	
}
