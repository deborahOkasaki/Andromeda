package br.com.fiap.andromeda.entity;

import java.io.Serializable;

public class ComodoItemEletronicoPK implements Serializable {
	
	int cdComodo;
	int cdItemEletronico;
	int cdComodoItemEletronico;
	
	public ComodoItemEletronicoPK() {
		super();
	}

	public ComodoItemEletronicoPK(int cdResidencia, int cdComodo, int cdItemEletronico, int cdComodoItemEletronico) {
		super();
		this.cdComodo = cdComodo;
		this.cdItemEletronico = cdItemEletronico;
		this.cdComodoItemEletronico = cdComodoItemEletronico;
	}

	public int getCdComodo() {
		return cdComodo;
	}

	public void setCdComodo(int cdComodo) {
		this.cdComodo = cdComodo;
	}

	public int getCdItemEletronico() {
		return cdItemEletronico;
	}

	public void setCdItemEletronico(int cdItemEletronico) {
		this.cdItemEletronico = cdItemEletronico;
	}

	public int getCdComodoItemEletronico() {
		return cdComodoItemEletronico;
	}

	public void setCdComodoItemEletronico(int cdComodoItemEletronico) {
		this.cdComodoItemEletronico = cdComodoItemEletronico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cdComodo;
		result = prime * result + cdComodoItemEletronico;
		result = prime * result + cdItemEletronico;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComodoItemEletronicoPK other = (ComodoItemEletronicoPK) obj;
		if (cdComodo != other.cdComodo)
			return false;
		if (cdComodoItemEletronico != other.cdComodoItemEletronico)
			return false;
		if (cdItemEletronico != other.cdItemEletronico)
			return false;
		return true;
	}	

}
