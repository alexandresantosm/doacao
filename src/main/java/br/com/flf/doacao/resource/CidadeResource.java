package br.com.flf.doacao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flf.doacao.domain.Cidade;
import br.com.flf.doacao.service.CidadeService;

@RestController
@RequestMapping("/api")
public class CidadeResource {

	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping("/cidades")
	public ResponseEntity<List<Cidade>> list() {
		
		List<Cidade> cidades = cidadeService.listar();
		
		return ResponseEntity.ok(cidades);
	}
	
	@GetMapping("/cidades/{id}")
	public ResponseEntity<?> find(@PathVariable Long id) {
		
		Cidade cidade = cidadeService.buscar(id);
		
		return ResponseEntity.ok(cidade);
	}
}
