package br.com.senai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired; // Importação necessária para injetar dependências
import org.springframework.stereotype.Controller; // Indica que esta classe é um controlador Spring
import org.springframework.ui.Model; // Importação necessária para trabalhar com o Model do Spring
import org.springframework.validation.BindingResult; // Importação necessária para tratar os resultados de validação
import org.springframework.validation.Errors; // Importação necessária para trabalhar com a classe Errors
import org.springframework.web.bind.annotation.GetMapping; // Importação para a anotação de mapeamento GET
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping; // Importação para a anotação de mapeamento POST

import br.com.senai.model.Produto; // Importação da classe de modelo Produto
import br.com.senai.repository.ProdutoRepository; // Importação do repositório de produtos

@Controller
public class ProdutoController {

    @Autowired 
    private ProdutoRepository produtoRepository; // Injeção de dependência do repositório de produtos

    @GetMapping("/")    
    public String paginaPrincipal() {
        return "index"; // Retorna o nome da View "index" para a página inicial
    }

    @GetMapping("/produto")
    public String listarProdutos(Model model) {
        List<Produto> produto = produtoRepository.findAll(); // Obtém uma lista de produtos do repositório
        model.addAttribute("produto", produto); // Adiciona a lista de produtos ao Model para uso na View
        return "produtos"; // Retorna o nome da View "produtos" para exibir a lista de produtos
    }
    
    @GetMapping("/cadastrarProduto")
    public String paginaAdicionarProduto(Produto produto) {
    	return "adicionar_produto"; // Retorna o nome da View "adicionar_produto" para a página de cadastro de produtos
    }
    
    @PostMapping("/adicionarProduto")
    public String adicionaProduto (@Valid Produto produto, Errors erros,
    								BindingResult result, Model model) {
    	if(result.hasErrors() || (null != erros && erros.getErrorCount() > 0)) {
    		return "adicionar_produto"; // Retorna o nome da View "adicionar_produto" se houver erros de validação
    	}
    	produtoRepository.save(produto); // Salva o novo produto no repositório
    	return "redirect:/produto"; // Redireciona para a URL "/produto" após adicionar o produto
    }
    
    @GetMapping("editar/{id}")
    public String paginaAtualizarProduto(
    		@PathVariable("id") long id, Model model) {
    	Produto produto = produtoRepository.findById(id)
                .orElseThrow(() ->
    			new IllegalArgumentException("Identificador do produto é inválido"+ id));
    	model.addAttribute("produto", produto);
    	return "redirect:editar_produto";
    }
    
    @PostMapping("/atualizar/{id}")
    public String atualizarProduto(@PathVariable("id") long id,@Valid Produto produto, 
    		BindingResult result, Model model) {
    	if (result.hasErrors()) {
    		produto.setId(id);
    		return "editar_produto";
    	}
    	produtoRepository.save(produto);
    	return "redirect:/produto";
    	
    }
    		
}


