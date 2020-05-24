package br.com.flf.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flf.doacao.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
