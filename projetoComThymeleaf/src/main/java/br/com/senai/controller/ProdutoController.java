// Importações necessárias para as classes e recursos utilizados
package br.com.senai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.model.Produto; // Importa a classe do modelo Produto
import br.com.senai.repository.ProdutoRepository; // Importa a classe do repositório de Produto

// Anotação que marca esta classe como um controlador
@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository; // Injeção de dependência do repositório de Produto
	
	// Mapeamento para a página principal
	@GetMapping("/")
	public String paginaPrincipal() {
		return "index"; // Retorna o nome da página a ser exibida (index.html ou similar)
	}
	
	// Mapeamento para listar os produtos
	@GetMapping("/produto")
	public String listarProdutos(Model model) {
		List<Produto> produtos = produtoRepository.findAll(); // Obtém a lista de produtos do repositório
		model.addAttribute("produtos", produtos); // Adiciona a lista de produtos ao modelo para exibição na página
		return "produtos"; // Retorna o nome da página de listagem de produtos
	}
	
	// Mapeamento para exibir a página de adicionar produto
	@GetMapping("/cadastrarProduto")
	public String paginaAdicionarProduto(Produto produto) {
		return "adicionar_produto"; // Retorna o nome da página de adicionar produto
	}
	
	// Mapeamento para processar o formulário de adição de produto
	@PostMapping("/adicionarProduto")
	public String adicionaProduto(@Valid Produto produto, 
			Errors erros, BindingResult result, Model model) {
		if(result.hasErrors() || (null != erros && erros.getErrorCount() > 0)) {
			return "adicionar_produto"; // Retorna a página de adicionar produto caso haja erros
		}
		produtoRepository.save(produto); // Salva o novo produto no repositório
		return "redirect:/produto"; // Redireciona para a página de listagem de produtos
	}
	
	// Mapeamento para exibir a página de editar produto
	@GetMapping("/editar/{id}")
	public String paginaAtualizarProduto(
			@PathVariable("id") long id, Model model) {
		Produto produto = produtoRepository.findById(id)
				.orElseThrow(() -> 
				new IllegalArgumentException("Identificador do produto é inválido" + id));
		
		model.addAttribute("produto", produto); // Adiciona o produto ao modelo para edição
		return "editar_produto"; // Retorna o nome da página de edição de produto
	}
	
	// Mapeamento para processar o formulário de atualização de produto
	@PostMapping("/atualizar/{id}")
	public String atualizarProduto(@PathVariable("id") long id,
			@Valid Produto produto, BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			produto.setId(id);
			return "editar_produto"; // Retorna a página de edição de produto caso haja erros
		}
		produtoRepository.save(produto); // Atualiza o produto no repositório
		return "redirect:/produto"; // Redireciona para a página de listagem de produtos
	}
	
	@GetMapping("/excluir/{id}")
	public String excluirProduto(@PathVariable Long id) {
	    produtoRepository.deleteById(id);
	    return "redirect:/produto"; // Redirecionar para a página de listagem após a exclusão
	}
}
