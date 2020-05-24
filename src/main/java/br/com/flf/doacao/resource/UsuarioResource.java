package br.com.flf.doacao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flf.doacao.domain.Usuario;
import br.com.flf.doacao.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> list() {
		
		List<Usuario> usuarios = usuarioService.listar();
		
		if (usuarios.isEmpty()) {
			System.out.println("menssagem: Nenhum registro foi encontrado!");
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuarios);
	}
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> find(@PathVariable Long id) {
		
		Usuario usuario = usuarioService.buscar(id);
		
		if (usuario == null) {
			System.out.println("menssagem: Nenhum usuário foi encontrado com esse id: " + id + "!");
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuario);
	}
}
