package br.com.fiap.andromeda.entity;

import java.io.Serializable;

public class UsuarioResidenciaPK implements Serializable {
	
	int cdUsuario;
	int cdResidencia;
	int cdUsuarioResidencia;
	
	public UsuarioResidenciaPK() {
		super();
	}

	public UsuarioResidenciaPK(int cdUsuario, int cdResidencia, int cdUsuarioResidencia) {
		super();
		this.cdUsuario = cdUsuario;
		this.cdResidencia = cdResidencia;
		this.cdUsuarioResidencia = cdUsuarioResidencia;
	}

	public int getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public int getCdResidencia() {
		return cdResidencia;
	}

	public void setCdResidencia(int cdResidencia) {
		this.cdResidencia = cdResidencia;
	}

	public int getCdUsuarioResidencia() {
		return cdUsuarioResidencia;
	}

	public void setCdUsuarioResidencia(int cdUsuarioResidencia) {
		this.cdUsuarioResidencia = cdUsuarioResidencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cdResidencia;
		result = prime * result + cdUsuario;
		result = prime * result + cdUsuarioResidencia;
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
		UsuarioResidenciaPK other = (UsuarioResidenciaPK) obj;
		if (cdResidencia != other.cdResidencia)
			return false;
		if (cdUsuario != other.cdUsuario)
			return false;
		if (cdUsuarioResidencia != other.cdUsuarioResidencia)
			return false;
		return true;
	}
	
}
