package br.com.senai.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired; // Importação necessária para injetar dependências
import org.springframework.stereotype.Controller; // Indica que esta classe é um controlador Spring
import org.springframework.ui.Model; // Importação necessária para trabalhar com o Model do Spring
import org.springframework.validation.BindingResult; // Importação necessária para tratar os resultados de validação
import org.springframework.validation.Errors; // Importação necessária para trabalhar com a classe Errors
import org.springframework.web.bind.annotation.GetMapping; // Importação para a anotação de mapeamento GET
import org.springframework.web.bind.annotation.PostMapping; // Importação para a anotação de mapeamento POST
import br.com.senai.model.Produto; // Importação da classe de modelo Produto
import br.com.senai.repository.ProdutoRepository; // Importação do repositório de produtos

@Controller
public class ProdutoController {

    @Autowired 
    private ProdutoRepository produtorepository; // Injeção de dependência do repositório de produtos

    @GetMapping("/")    
    public String paginaPrincipal() {
        return "index"; // Retorna o nome da View "index" para a página inicial
    }

    @GetMapping("/produto")
    public String listarProdutos(Model model) {
        List<Produto> produtos = produtorepository.findAll(); // Obtém uma lista de produtos do repositório
        model.addAttribute("produtos", produtos); // Adiciona a lista de produtos ao Model para uso na View
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
    	produtorepository.save(produto); // Salva o novo produto no repositório
    	return "redirect:/produto"; // Redireciona para a URL "/produto" após adicionar o produto
    }
}
