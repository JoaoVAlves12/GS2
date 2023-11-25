package br.com.IncluStep.IS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.IncluStep.IS.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
