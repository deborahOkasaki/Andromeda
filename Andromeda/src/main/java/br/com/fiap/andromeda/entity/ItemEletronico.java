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
@Table(name="t_item_eletronico")
public class ItemEletronico {
	
	@Id
	@SequenceGenerator(name="itemEletronico", sequenceName="sq_tb_item_eletronico", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="itemEletronico")
	@Column(name="cd_item_eletronico")
	private int cdItemEletronico;
	
	@Column(name="nm_item_eletronico",nullable=false,length=20)
	private String nmItemEletronico; 
	
	@Column(name="nm_marca",nullable=false,length=20)
	private String nmMarca; 
	
	@Column(name="nm_modelo",nullable=false,length=20)
	private String nmModelo; 
	
	@Column(name="vl_potencia",nullable=false)
	private int vlPotencia;

	@Column(name="vl_consumo_kwh",nullable=false)
	private int vlConsumoKwh;
	
	@ManyToOne
	@JoinColumn(name="cd_categoria",nullable=false)
	private Categoria cdCategoria;

	public ItemEletronico() {
		super();
	}

	public ItemEletronico(int cdItemEletronico, String nmItemEletronico, String nmMarca, String nmModelo,
			int vlPotencia, int vlConsumoKwh, Categoria cdCategoria) {
		super();
		this.cdItemEletronico = cdItemEletronico;
		this.nmItemEletronico = nmItemEletronico;
		this.nmMarca = nmMarca;
		this.nmModelo = nmModelo;
		this.vlPotencia = vlPotencia;
		this.vlConsumoKwh = vlConsumoKwh;
		this.cdCategoria = cdCategoria;
	}

	public int getCdItemEletronico() {
		return cdItemEletronico;
	}

	public void setCdItemEletronico(int cdItemEletronico) {
		this.cdItemEletronico = cdItemEletronico;
	}

	public String getNmItemEletronico() {
		return nmItemEletronico;
	}

	public void setNmItemEletronico(String nmItemEletronico) {
		this.nmItemEletronico = nmItemEletronico;
	}

	public String getNmMarca() {
		return nmMarca;
	}

	public void setNmMarca(String nmMarca) {
		this.nmMarca = nmMarca;
	}

	public String getNmModelo() {
		return nmModelo;
	}

	public void setNmModelo(String nmModelo) {
		this.nmModelo = nmModelo;
	}

	public int getVlPotencia() {
		return vlPotencia;
	}

	public void setVlPotencia(int vlPotencia) {
		this.vlPotencia = vlPotencia;
	}

	public int getVlConsumoKwh() {
		return vlConsumoKwh;
	}

	public void setVlConsumoKwh(int vlConsumoKwh) {
		this.vlConsumoKwh = vlConsumoKwh;
	}

	public Categoria getCdCategoria() {
		return cdCategoria;
	}

	public void setCdCategoria(Categoria cdCategoria) {
		this.cdCategoria = cdCategoria;
	}
	
}
