package br.edu.infnet.servico;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.dominio.Usuario;
import br.edu.infnet.repositorio.UsuarioRepository;

@Service
public class UsuarioServico {
	
	
	@Autowired
	private UsuarioRepository repositorio;
	
	@Transactional
	public void salvarUsuario(String nome, String endereco, String email) {
		
		Usuario novoUsuario = new Usuario();
		novoUsuario.setNome(nome); 
		novoUsuario.setEndereco(endereco);
		novoUsuario.setEmail(email);
		repositorio.save(novoUsuario);
		
	}
    @GetMapping
	public List<Usuario> listarUsuarios(){
		List<Usuario> retornoDaLista= repositorio.findAll();
		return retornoDaLista;
	}

}