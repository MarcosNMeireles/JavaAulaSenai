package br.com.trabalho.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.trabalho.model.Cliente; 
import br.com.trabalho.repository.ClienteRepository; 

@Controller
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository; // Injeção de dependência do repositório de clientes

    // Mapeamento para a página inicial
    @GetMapping("/cliente")
    public String paginaPrincipal() {
        return "/";
    }

    // Mapeamento para a página de cadastro de cliente
    @GetMapping("/cadastrar_Cliente")
    public String paginaCadastrarCliente(Model model) {
        Cliente cliente = new Cliente(); // Cria uma instância de Cliente
        model.addAttribute("cliente", cliente); // Adiciona o cliente ao modelo para a página
        return "cadastrar_Cliente"; // Retorna o nome da página de cadastro de cliente
    }

    // Ação de cadastrar um cliente
    @PostMapping("/cadastrar_Cliente")
    public String cadastrarCliente(@ModelAttribute @Valid Cliente cliente, BindingResult result) {
        if (result.hasErrors()) { // Verifica se há erros de validação
            return "cadastrar_Cliente"; // Retorna à página de cadastro se houver erros
        }
        clienteRepository.save(cliente); // Salva o cliente no repositório
        return "redirect:/"; // Redireciona para a página inicial
    }

    // Mapeamento para a página de consulta de clientes
    @GetMapping("/consultarCliente")
    public String consultarClientes(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll()); // Adiciona a lista de clientes ao modelo
        return "consultarCliente"; // Retorna o nome da página de consulta de clientes
    }

    // Mapeamento para a página de edição de um cliente específico
    @GetMapping("/editar/{id}")
    public String paginaAtualizarCliente(@PathVariable("id") long id, 
    		Model model) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Identificador do cliente é inválido: " + id));
        model.addAttribute("clientes", cliente); // Adiciona o cliente ao modelo para a página de edição
        return "editarCliente"; // Retorna o nome da página de edição de cliente
    }

    // Ação de deletar um cliente
    @GetMapping("/delete/{id}")
    public String deletarCliente(@PathVariable("id") long id, Model model) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Identificador do cliente inválido" + id));
        clienteRepository.delete(cliente); // Deleta o cliente do repositório
        return "redirect:/consultarCliente"; // Redireciona para a página de consulta de clientes
    }

    // Ação de salvar um cliente (usado no cadastro e na edição)
    @PostMapping("/salvar-cliente")
    public String salvarCliente(@ModelAttribute @Valid Cliente cliente, BindingResult result) {
        if (result.hasErrors()) { // Verifica se há erros de validação
            return "cadastrar_Cliente"; // Retorna à página de cadastro se houver erros
        }
        clienteRepository.save(cliente); // Salva o cliente no repositório
        return "redirect:/"; // Redireciona para a página inicial
    }


}

