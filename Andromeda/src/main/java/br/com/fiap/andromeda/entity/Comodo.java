package br.com.fiap.andromeda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_comodo")
public class Comodo {
	
	@Id
	@SequenceGenerator(name="comodo", sequenceName="sq_tb_comodo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="comodo")
	@Column(name="cd_comodo")
	private int cdComodo;
	
	@ManyToOne
	@JoinColumn(name="cd_residencia")
	private Residencia cdResidencia;

	@Column(name="nm_comodo",nullable=false,length=20)
	private String nmComodo; 
	
	@Column(name="tp_comodo",nullable=false)
	private int tpComodo;

	public Comodo() {
		super();
	}

	public Comodo(Residencia cdResidencia, int cdComodo, String nmComodo, int tpComodo) {
		super();
		this.cdResidencia = cdResidencia;
		this.cdComodo = cdComodo;
		this.nmComodo = nmComodo;
		this.tpComodo = tpComodo;
	}

	public Residencia getCdResidencia() {
		return cdResidencia;
	}

	public void setCdResidencia(Residencia cdResidencia) {
		this.cdResidencia = cdResidencia;
	}

	public int getCdComodo() {
		return cdComodo;
	}

	public void setCdComodo(int cdComodo) {
		this.cdComodo = cdComodo;
	}

	public String getNmComodo() {
		return nmComodo;
	}

	public void setNmComodo(String nmComodo) {
		this.nmComodo = nmComodo;
	}

	public int getTpComodo() {
		return tpComodo;
	}

	public void setTpComodo(int tpComodo) {
		this.tpComodo = tpComodo;
	}
	
}
