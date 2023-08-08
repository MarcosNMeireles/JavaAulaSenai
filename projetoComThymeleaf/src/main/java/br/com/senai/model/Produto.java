// Pacote onde a classe está localizada
package br.com.senai.model;

// Importações das anotações necessárias para mapeamento JPA
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Anotação @Entity indica que essa classe é uma entidade mapeada no banco de dados
@Entity
public class Produto {

    // Anotação @Id indica que esse campo é a chave primária da entidade
    @Id
    // Anotação @GeneratedValue especifica que o valor do ID será gerado automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // Nome do produto
    private int quantidade; // Quantidade disponível do produto
    private double preco; // Preço do produto
    private String descricaoProduto; // Descrição detalhada do produto
    private String urlImagem; // URL da imagem associada ao produto

    // Métodos de acesso e modificação para o campo 'id'
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Métodos de acesso e modificação para o campo 'nome'
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos de acesso e modificação para o campo 'quantidade'
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos de acesso e modificação para o campo 'preco'
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Métodos de acesso e modificação para o campo 'descricaoProduto'
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    // Métodos de acesso e modificação para o campo 'urlImagem'
    public String getUrlImagem() {
        return urlImagem;
    }
    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
