package br.com.trabalho.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.trabalho.model.Agendamento;
import br.com.trabalho.repository.AgendamentoRepository;
import br.com.trabalho.service.AgendamentoService; 
@Service
public class AgendamentoServiceImpl implements AgendamentoService { 

    private final AgendamentoRepository agendamentoRepository;

    @Autowired
    public AgendamentoServiceImpl(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    public void salvarAgendamento(Agendamento agendamento) {
        agendamentoRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> listarTodosAgendamentos() {
        return agendamentoRepository.findAll();
    }

    @Override
    public Agendamento buscarAgendamentoPorId(Long id) {
        return agendamentoRepository.findById(id).orElse(null);
    }

    @Override
    public Agendamento buscarAgendamentoPorNome(String nome) {
        return agendamentoRepository.findByNome(nome).orElse(null);
    }

    @Override
    public void excluirAgendamento(Long id) {
        agendamentoRepository.deleteById(id);
    }
}
