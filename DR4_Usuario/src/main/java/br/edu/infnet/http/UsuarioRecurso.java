package br.edu.infnet.http;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.dominio.Usuario;
import br.edu.infnet.http.entrada.UsuarioInput;
import br.edu.infnet.servico.UsuarioServico;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioRecurso {
	
	@Autowired
	private UsuarioServico servico;
	
	
	@PostMapping
	public void salvarUsuario(@RequestBody UsuarioInput usuario) {
		
		servico.salvarUsuario(usuario.getNome(), usuario.getEndereco(), usuario.getEmail());
	}
	
	@GetMapping
	public List<Usuario> listarUsuarios() {
		return servico.listarUsuarios();
		
	}

	
	
	
}
