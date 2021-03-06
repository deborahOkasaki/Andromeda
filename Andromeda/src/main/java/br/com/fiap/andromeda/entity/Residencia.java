package br.com.fiap.andromeda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_residencia")
public class Residencia {
	
	@Id
	@SequenceGenerator(name="residencia", sequenceName="sq_tb_residencia", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="residencia")
	@Column(name="cd_residencia")
	private int cdResidencia;
	
	@Column(name="nm_residencia",nullable=false,length=20)
	private String nmResidencia; 
	
	@Column(name="tp_residencia",nullable=false)
	private int tpResidencia;

	public Residencia() {
		super();
	}

	public Residencia(int cdResidencia, String nmResidencia, int tpResidencia) {
		super();
		this.setCdResidencia(cdResidencia);
		this.setNmResidencia(nmResidencia);
		this.setTpResidencia(tpResidencia);
	}
	
	public Residencia(String nmResidencia, int tpResidencia) {
		super();
		this.nmResidencia = nmResidencia;
		this.tpResidencia = tpResidencia;
	}

	public int getCdResidencia() {
		return cdResidencia;
	}

	public void setCdResidencia(int cdResidencia) {
		this.cdResidencia = cdResidencia;
	}

	public String getNmResidencia() {
		return nmResidencia;
	}

	public void setNmResidencia(String nmResidencia) {
		this.nmResidencia = nmResidencia;
	}

	public int getTpResidencia() {
		return tpResidencia;
	}

	public void setTpResidencia(int tpResidencia) {
		this.tpResidencia = tpResidencia;
	}
	
	public String getAll() {
		return (
				"Código Residência: " + cdResidencia + "\n" +
				"Nome Residência: " + nmResidencia + "\n" +
				"Tipo Residência: " + tpResidencia
				);
	}
	
	public void setAll(int cdResidencia, String nmResidencia, int tpResidencia) {
		this.setCdResidencia(cdResidencia);
		this.setNmResidencia(nmResidencia);
		this.setTpResidencia(tpResidencia);
	}
	
}
