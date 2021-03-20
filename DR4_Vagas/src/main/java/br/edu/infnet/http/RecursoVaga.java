package br.edu.infnet.http;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.dominio.Vaga;
import br.edu.infnet.http.entrada.VagaEntrada;
import br.edu.infnet.servico.ServicoVaga;

@RestController
@RequestMapping(value = "/vaga")
public class RecursoVaga {

	@Autowired
	private ServicoVaga servico;
	
	@PostMapping
	public void cadastrarUsuario(@RequestBody VagaEntrada vaga) {
		servico.cadastrarVaga(vaga);
	}
	
	@GetMapping()
	public ResponseEntity<List<Vaga>> buscarTodasAsVagas() {
		List<Vaga> resposta = new ArrayList<>();
		
		resposta.addAll(servico.buscarTodasAsVagas());
		
		return ResponseEntity.ok(resposta);	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Vaga> buscarVagaPorId(@PathVariable("id") Integer id) {
		Vaga resposta = servico.buscarVagaPorId(id);
		
		
		if (resposta != null) {
			return ResponseEntity.ok(resposta);			
		}
		
		return ResponseEntity.notFound().build();
	}
	
	
}
