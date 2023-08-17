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
   public String listarMedicos(Model model) {
       model.addAttribute("medicos", medicoRepository.findAll());
       return "consultarMedico";
   }

   @GetMapping("/ver-medico/{id}")
   public String verMedico(@PathVariable("id") Long id, Model model) {
       Medico medico = medicoRepository.findById(id)
               .orElseThrow(() -> new IllegalArgumentException("Identificador do médico inválido: " + id));

       model.addAttribute("medico", medico);
       return "ver_Medico"; // Substitua "ver_Medico" pelo nome da página que irá exibir os detalhes do médico
   }  
    
   @GetMapping("/editar-medico/{id}")
   public String exibirPaginaEditarMedico(@PathVariable Long id, Model model) {
       Medico medico = medicoRepository.findById(id)
               .orElseThrow(() -> new IllegalArgumentException("Identificador do médico inválido: " + id));

       model.addAttribute("medico", medico);
       return "editar_Medico"; // Retorna o nome da página HTML para exibir
   }

   @PostMapping("/editar-medico/{id}")
   public String editarMedico(@PathVariable Long id, @ModelAttribute @Valid Medico medicoAtualizado, BindingResult result) {
       if (result.hasErrors()) {
           return "editar_Medico"; // Retorna para a página de edição em caso de erros
       }

       medicoAtualizado.setId(id); // Define corretamente o ID do médico atualizado
       medicoRepository.save(medicoAtualizado);
       return "redirect:/consultarMedico"; // Redireciona para a página de consulta após a edição
   }
    

    @GetMapping("/removerMedico/{id}")
    public String removerMedico(@PathVariable("id") long id, Model model) {
        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Identificador do medico invalido" + id));
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
    
    @GetMapping("/error")
    public String handleError() {
        // Lógica para lidar com erros, redirecionar ou exibir uma página de erro personalizada
        return "error"; // Substitua "error" pelo nome da página de erro personalizada
    }
    
}
