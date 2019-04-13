package br.com.fiap.andromeda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_usuario")
public class Usuario {

	@Id
	@SequenceGenerator(name="usuario", sequenceName="sq_tb_usuario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario")
	@Column(name="cd_usuario")
	private int cdUsuario;
	
	@Column(name="nm_usuario",nullable=false,length=40)
	private String nmUsuario; 
	
	@Column(name="nr_cpf",nullable=false)
	private int nrCpf;
	
	@Column(name="ds_email",nullable=false,length=20)
	private String dsEmail;
	
	@Column(name="tx_senha",nullable=false,length=12)
	private String dsSenha;

	
	public Usuario() {
		super();
	}

	public Usuario(int cdUsuario, String nmUsuario, int nrCpf, String dsEmail, String dsSenha) {
		super();
		this.cdUsuario = cdUsuario;
		this.nmUsuario = nmUsuario;
		this.nrCpf = nrCpf;
		this.dsEmail = dsEmail;
		this.dsSenha = dsSenha;
	}

	public int getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public int getNrCpf() {
		return nrCpf;
	}

	public void setNrCpf(int nrCpf) {
		this.nrCpf = nrCpf;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getDsSenha() {
		return dsSenha;
	}

	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}
	
	
}
