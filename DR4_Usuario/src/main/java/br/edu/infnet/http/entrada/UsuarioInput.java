package br.edu.infnet.http.entrada;

import java.io.Serializable;

public class UsuarioInput implements Serializable {
	
	private String nome;
	private String endereco;
	private String email;
	public UsuarioInput() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
    
}
