package br.com.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalho.model.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Cliente save(Cliente cliente);

    List<Cliente> findAll();

}

