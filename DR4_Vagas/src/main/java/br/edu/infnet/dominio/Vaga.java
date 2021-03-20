package br.edu.infnet.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Vaga implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer idUsuario;
	
	private String cargo;
	
	private String cidade;
	
	private String formaContratacao;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(schema = "public", name = "vagacriterio",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "idCriterio")})
    private List<Criterio> criterios = new ArrayList<>();
	
	public Vaga() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<Criterio> getCriterios() {
		return criterios;
	}

	public void setCriterios(List<Criterio> criterios) {
		this.criterios = criterios;
	}
}
