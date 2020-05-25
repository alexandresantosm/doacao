package br.com.flf.doacao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flf.doacao.domain.Endereco;
import br.com.flf.doacao.service.EnderecoService;

@RestController
@RequestMapping("/api")
public class EnderecoResource {

	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping("/enderecos")
	public ResponseEntity<List<Endereco>> list() {
		List<Endereco> enderecos = enderecoService.listar();
		
		return ResponseEntity.ok(enderecos);
	}
	
	@GetMapping("/enderecos/{id}")
	public ResponseEntity<Endereco> find(@PathVariable Long id) {
		Endereco endereco = enderecoService.buscar(id);
		
		return ResponseEntity.ok(endereco);
	}
}
