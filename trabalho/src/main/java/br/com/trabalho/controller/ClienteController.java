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
    private ClienteRepository clienteRepository; 

    
    @GetMapping("/cliente")
    public String paginaPrincipal() {
        return "/";
    }

   
    @GetMapping("/cadastrar_Cliente")
    public String paginaCadastrarCliente(Model model) {
        Cliente cliente = new Cliente(); 
        model.addAttribute("cliente", cliente); 
        return "cadastrar_Cliente"; 
    }

    @PostMapping("/cadastrar_Cliente")
    public String cadastrarCliente(@ModelAttribute @Valid Cliente cliente, BindingResult result) {
        if (result.hasErrors()) { 
            return "cadastrar_Cliente"; 
        }
        clienteRepository.save(cliente); 
        return "redirect:/"; 
    }

    
    @GetMapping("/consultarCliente")
    public String consultarClientes(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll()); 
        return "consultarCliente"; 
    }

    @GetMapping("/editar/{id}")
    public String paginaAtualizarCliente(@PathVariable("id") long id, Model model) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Identificador do cliente È inv·lido: " + id));
        model.addAttribute("cliente", cliente); 
        return "editarCliente"; 
    }

    
    
    @GetMapping("/delete/{id}")
    public String deletarCliente(@PathVariable("id") long id, Model model) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Identificador do cliente inv√°lido" + id));
        clienteRepository.delete(cliente); 
        return "redirect:/consultarCliente"; 
    }

   
    @PostMapping("/salvar-cliente")
    public String salvarCliente(@ModelAttribute @Valid Cliente cliente, BindingResult result) {
        if (result.hasErrors()) { 
            return "cadastrar_Cliente"; 
        }
        clienteRepository.save(cliente); 
        return "redirect:/"; 
    }


}

