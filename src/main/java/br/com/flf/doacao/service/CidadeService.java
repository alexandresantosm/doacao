package br.com.flf.doacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flf.doacao.domain.Cidade;
import br.com.flf.doacao.repository.CidadeRepository;
import br.com.flf.doacao.service.exception.ObjectNotFoundException;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;

	public List<Cidade> listar() {
		List<Cidade> cidades = cidadeRepository.findAll();

		if (cidades.isEmpty()) {
			throw new ObjectNotFoundException("Não há registro de cidades no sistema! Tipo: " + Cidade.class.getName());
		}

		return cidades;
	}

	public Cidade buscar(Long id) {

		Optional<Cidade> cidade = cidadeRepository.findById(id);

		return cidade.orElseThrow(() -> new ObjectNotFoundException(
				"Nenhuma cidade foi encontrada com o ID: " + id + ", Tipo: " + Cidade.class.getName())
			);
	}
}
