package br.edu.infnet.http.entrada;

import java.io.Serializable;

public class CriterioEntrada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private String perfil;
	private Integer peso;
	
	public CriterioEntrada() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}
}
