package br.com.flf.doacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flf.doacao.domain.Estado;
import br.com.flf.doacao.repository.EstadoRepository;
import br.com.flf.doacao.service.exception.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listar() {		
		List<Estado> estados = estadoRepository.findAll();
		
		if (estados.isEmpty()) {
			throw new ObjectNotFoundException("Não há registro de estados no sistema! Tipo: " + Estado.class.getName());
		}
		
		return estados;
	}
	
	public Estado buscar(Long id) {
		
		Optional<Estado> estado = estadoRepository.findById(id);
		
		return estado.orElseThrow(
				() -> new ObjectNotFoundException("Nenhum estado foi encontrado com o ID: " + id + ", Tipo: " + Estado.class.getName())
			);
	}
}
