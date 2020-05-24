package br.com.flf.doacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flf.doacao.domain.Usuario;
import br.com.flf.doacao.repository.UsuarioRepository;
import br.com.flf.doacao.service.exception.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listar() {		
		List<Usuario> usuarios = usuarioRepository.findAll();
		
		if (usuarios.isEmpty()) {
			throw new ObjectNotFoundException("Não há registro de usuários no sistema! Tipo: " + Usuario.class.getName());
		}
		
		return usuarios;
	}
	
	public Usuario buscar(Long id) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		return usuario.orElseThrow(
				() -> new ObjectNotFoundException("Nenhum usuário foi encontrado com o ID: " + id + ", Tipo: " + Usuario.class.getName())
				);
	}
}
