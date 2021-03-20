package br.edu.infnet.http.entrada;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VagaEntrada implements Serializable {

	private static final long serialVersionUID = 1L;

	public Integer idUsuario;
	public String cargo;
	public String cidade;
	public String formaContratacao;
	public List<CriterioEntrada> criterios = new ArrayList<>();
	

	public VagaEntrada() {
		
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getFormaContratacao() {
		return formaContratacao;
	}

	public void setFormaContratacao(String formaContratacao) {
		this.formaContratacao = formaContratacao;
	}

	public List<CriterioEntrada> getCriterios() {
		return criterios;
	}

	public void setCriterios(List<CriterioEntrada> criterios) {
		this.criterios = criterios;
	}
}
