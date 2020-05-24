package br.com.flf.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flf.doacao.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
