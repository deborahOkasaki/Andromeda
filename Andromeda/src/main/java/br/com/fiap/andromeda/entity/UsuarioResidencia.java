package br.com.fiap.andromeda.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_usuario_residencia")
@IdClass(UsuarioResidenciaPK.class)
public class UsuarioResidencia implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Usuario cdUsuario;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_residencia")
	private Residencia cdResidencia;

	@Id
	@SequenceGenerator(name="usuario_residencia", sequenceName="sq_tb_usuario_residencia", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario_residencia")
	@Column(name="cd_usuario_residencia")
	private int cdUsuarioResidencia;
	
	@Column(name="tp_acesso_usuario",nullable=false)
	private int tpAcessoUsuario;

	public UsuarioResidencia() {
		super();
	}

	public UsuarioResidencia(Usuario cdUsuario, Residencia cdResidencia, int cdUsuarioResidencia, int tpAcessoUsuario) {
		super();
		this.cdUsuario = cdUsuario;
		this.cdResidencia = cdResidencia;
		this.cdUsuarioResidencia = cdUsuarioResidencia;
		this.tpAcessoUsuario = tpAcessoUsuario;
	}
	
	public UsuarioResidencia(Usuario cdUsuario, Residencia cdResidencia, int tpAcessoUsuario) {
		super();
		this.cdUsuario = cdUsuario;
		this.cdResidencia = cdResidencia;
		this.tpAcessoUsuario = tpAcessoUsuario;
	}

	public Usuario getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(Usuario cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public Residencia getCdResidencia() {
		return cdResidencia;
	}

	public void setCdResidencia(Residencia cdResidencia) {
		this.cdResidencia = cdResidencia;
	}

	public int getCdUsuarioResidencia() {
		return cdUsuarioResidencia;
	}

	public void setCdUsuarioResidencia(int cdUsuarioResidencia) {
		this.cdUsuarioResidencia = cdUsuarioResidencia;
	}

	public int getTpAcessoUsuario() {
		return tpAcessoUsuario;
	}

	public void setTpAcessoUsuario(int tpAcessoUsuario) {
		this.tpAcessoUsuario = tpAcessoUsuario;
	}	
	
	public String getAll() {
		return(
				"Código Usuário: " + cdUsuario.getCdUsuario() + "\n" +
				"Código Residencia: " + cdResidencia.getCdResidencia() + "\n" +
				"Código Usuário-Residência: " + cdUsuarioResidencia + "\n" +
				"Tipo de Acesso: " + tpAcessoUsuario
				);
	}
	
	public void setAll(Usuario cdUsuario, Residencia cdResidencia, int cdUsuarioResidencia, int tpAcessoUsuario) {
		this.setCdResidencia(cdResidencia);
		this.setCdUsuario(cdUsuario);
		this.setCdUsuarioResidencia(cdUsuarioResidencia);
		this.setTpAcessoUsuario(tpAcessoUsuario);
	}
}
