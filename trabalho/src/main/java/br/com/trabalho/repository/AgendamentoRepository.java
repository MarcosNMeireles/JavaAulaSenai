package br.com.trabalho.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalho.model.Agendamento;


public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
	Optional<Agendamento> findByNome(String nome);
}

