package br.com.flf.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flf.doacao.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
