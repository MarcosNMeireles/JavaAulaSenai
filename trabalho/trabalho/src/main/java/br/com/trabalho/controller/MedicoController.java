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

import br.com.trabalho.model.Medico;
import br.com.trabalho.repository.MedicoRepository;

@Controller
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping("/medico")
    public String paginaPrincipal() {
        return "/"; 
    }

    @GetMapping("/cadastrar_Medico")
    public String paginaCadastrarMedico(Model model) {
        Medico medico = new Medico();
        model.addAttribute("medico", medico);
        return "cadastrar_Medico";
    }

    @PostMapping("/cadastrar_Medico")
    public String cadastrarMedico(@ModelAttribute @Valid Medico medico, BindingResult result) {
        if (result.hasErrors()) {
            return "cadastrar_Medico";
        }
        medicoRepository.save(medico);
        return "redirect:/"; 
    }

    @GetMapping("/consultarMedico")
    public String consultarMedicos(Model model) {
        model.addAttribute("medicos", medicoRepository.findAll());
        return "consultarMedico";
    }

    @GetMapping("/editar-medico/{id}")
    public String paginaAtualizarMedico(@PathVariable("id") long id, Model model) {
        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Identificador do medico é inválido: " + id));
        model.addAttribute("medico", medico); 
        return "editarMedico";
    }


    @GetMapping("/removerMedico/{id}")
    public String removerMedico(@PathVariable("id") long id, Model model) {
        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Identificador do medico inválido" + id));
        medicoRepository.delete(medico);
        return "redirect:/consultarMedico";
    }

    @PostMapping("/salvar-medico")
    public String salvarMedico(@ModelAttribute @Valid Medico medico, BindingResult result) {
        if (result.hasErrors()) {
            return "cadastrar_Medico";
        }
        medicoRepository.save(medico);
        return "redirect:/"; 
    }
}
