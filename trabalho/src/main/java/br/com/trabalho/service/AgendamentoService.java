package br.com.trabalho.service;

import java.util.List;
import br.com.trabalho.model.Agendamento;

public interface AgendamentoService {

    void salvarAgendamento(Agendamento agendamento);
    List<Agendamento> listarTodosAgendamentos();
    Agendamento buscarAgendamentoPorId(Long id);
    Agendamento buscarAgendamentoPorNome(String nome); 
    void excluirAgendamento(Long id);
}
