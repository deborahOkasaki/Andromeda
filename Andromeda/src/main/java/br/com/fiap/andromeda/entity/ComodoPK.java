package br.com.fiap.andromeda.entity;

import java.io.Serializable;

public class ComodoPK implements Serializable {

	int cdResidencia;
	int cdComodo;
	
	public ComodoPK() {
		super();

	}

	public ComodoPK(int cdResidencia, int cdComodo) {
		super();
		this.cdResidencia = cdResidencia;
		this.cdComodo = cdComodo;
	}

	public int getCdResidencia() {
		return cdResidencia;
	}

	public void setCdResidencia(int cdResidencia) {
		this.cdResidencia = cdResidencia;
	}

	public int getCdComodo() {
		return cdComodo;
	}

	public void setCdComodo(int cdComodo) {
		this.cdComodo = cdComodo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cdComodo;
		result = prime * result + cdResidencia;
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
		ComodoPK other = (ComodoPK) obj;
		if (cdComodo != other.cdComodo)
			return false;
		if (cdResidencia != other.cdResidencia)
			return false;
		return true;
	} 
	
	
}
