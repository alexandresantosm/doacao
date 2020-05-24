package br.com.flf.doacao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flf.doacao.domain.Estado;
import br.com.flf.doacao.service.EstadoService;

@RestController
@RequestMapping("/api")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/estados")
	public ResponseEntity<List<Estado>> list() {
		
		List<Estado> estados = estadoService.listar();
		
		return ResponseEntity.ok(estados);
	}
	
	@GetMapping("/estados/{id}")
	public ResponseEntity<?> find(@PathVariable Long id) {
		
		Estado estado = estadoService.buscar(id);
		
		return ResponseEntity.ok(estado);
	}
}
