package br.com.flf.doacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flf.doacao.domain.Endereco;
import br.com.flf.doacao.repository.EnderecoRepository;
import br.com.flf.doacao.service.exception.ObjectNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<Endereco> listar() {
		List<Endereco> enderecos = enderecoRepository.findAll();
		
		if (enderecos.isEmpty()) {
			throw new ObjectNotFoundException("Não há registro de endereços no sistema! Tipo: " + Endereco.class.getName());
		}
		
		return enderecos;
	}
	
	public Endereco buscar(Long id) {
		Optional<Endereco> endereco = enderecoRepository.findById(id);
		
		return endereco.orElseThrow(() -> new ObjectNotFoundException(
				"Nenhum endereço foi encontrado com o ID: " + id + ", Tipo: " + Endereco.class.getName())
			);
	}
}
