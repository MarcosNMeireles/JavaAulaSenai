package br.com.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalho.model.Medico;



public interface MedicoRepository extends JpaRepository<Medico, Long> {
	Medico save(Medico medico);

    List<Medico> findAll();

}

