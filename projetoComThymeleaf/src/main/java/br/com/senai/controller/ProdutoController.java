// Importações necessárias
package br.com.senai.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; // Importação necessária para injetar dependências
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Importação necessária para trabalhar com o Model do Spring
import org.springframework.web.bind.annotation.GetMapping;
import br.com.senai.model.Produto;
import br.com.senai.repository.ProdutoRepository; // Importação do repositório

@Controller
public class ProdutoController {

    // Injeção de dependência do repositório de produtos
	//Isso permite que o Spring injete automaticamente o repositório no controlador.
    @Autowired 
    private ProdutoRepository produtorepository;

     
    @GetMapping("/")
    
	/*
	 * Essa anotação é aplicada ao método paginaPrincipal() no controlador. Indica
	 * que o método será acionado quando uma solicitação HTTP GET for feita para a
	 * URL raiz do aplicativo, ou seja, a URL principal (por exemplo,
	 * http://localhost:8080/). Neste exemplo, o método paginaPrincipal() retorna
	 * uma string "index", que provavelmente se refere a uma View chamada index.
	 * Isso significa que quando um usuário acessar a página inicial do aplicativo,
	 * ele será direcionado para a View index.
	 */
    
    public String paginaPrincipal() {
        return "index";
    }

    @GetMapping("/produto")
	/*
	 * Essa anotação é aplicada ao método listarProdutos() no controlador. Indica
	 * que o método será acionado quando uma solicitação HTTP GET for feita para a
	 * URL "/produtos" do aplicativo (por exemplo, http://localhost:8080/produtos).
	 * Dentro do método listarProdutos(), há uma lógica para obter uma lista de
	 * produtos do repositório e adicioná-la ao Model. A intenção provavelmente é
	 * exibir uma lista de produtos em uma View correspondente.
	 */
    
    public String listarProdutos(Model model) {
        List<Produto> produtos = produtorepository.findAll(); // Adicione findAll() para obter a lista de produtos
        model.addAttribute("produtos", produtos); // Adiciona a lista de produtos ao Model para uso na View
        return "produtos"; // Supondo que há uma View chamada "produtos" para exibir a lista de produtos - acessando a página
    }
}
