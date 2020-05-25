package br.com.flf.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flf.doacao.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
