package br.com.flf.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flf.doacao.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
