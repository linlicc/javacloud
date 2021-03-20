package br.edu.infnet.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.dominio.Criterio;
import br.edu.infnet.dominio.Vaga;
import br.edu.infnet.http.entrada.CriterioEntrada;
import br.edu.infnet.http.entrada.VagaEntrada;
import br.edu.infnet.repositorio.CriterioRepositorio;
import br.edu.infnet.repositorio.VagaRepositorio;

@Service
public class ServicoVaga {
	
	@Autowired
	private VagaRepositorio repositorio;
	
	@Autowired
	private CriterioRepositorio criterioRepositorio;
	
	public void cadastrarVaga(VagaEntrada vaga) {
		
		Vaga novaVaga = new Vaga();
		novaVaga.setIdUsuario(vaga.getIdUsuario());
		novaVaga.setCargo(vaga.getCargo());
		novaVaga.setCidade(vaga.getCidade());
		novaVaga.setFormaContratacao(vaga.getFormaContratacao());
		
		
		for(CriterioEntrada criterioEntrada : vaga.criterios) {
			
			Criterio criterio = new Criterio();
			criterio.setDescricao(criterioEntrada.getDescricao());
			criterio.setPerfil(criterioEntrada.getPerfil());
			criterio.setPeso(criterioEntrada.getPeso());
			
			criterio = criterioRepositorio.save(criterio);
			
			novaVaga.getCriterios().add(criterio);
		}
		
		repositorio.save(novaVaga);
	
	}

	public Vaga buscarVagaPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	public List<Vaga> buscarTodasAsVagas() {
		return repositorio.findAll();
	}

}
