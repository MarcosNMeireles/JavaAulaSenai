// Importações necessárias para as classes e recursos utilizados
package br.com.senai.model;

import javax.persistence.Entity; // Importa a anotação para marcar como entidade de banco de dados
import javax.persistence.GeneratedValue; // Importa a anotação para gerar valor automático para o ID
import javax.persistence.GenerationType;
import javax.persistence.Id; // Importa a anotação para definir como identificador único
import javax.validation.constraints.Min; // Importa a anotação para validação de valor mínimo
import javax.validation.constraints.NotEmpty; // Importa a anotação para validação de não vazio
import javax.validation.constraints.NotNull; // Importa a anotação para validação de não nulo
import javax.validation.constraints.Size; // Importa a anotação para definir tamanho

/*As anotações, como @Entity, @Id, @NotNull, @Size e @Min, são usadas para definir regras de validação
e mapeamento para o banco de dados. Os métodos get e set são usados para acessar e modificar essas
informações. No geral, essa classe ajuda a organizar e representar os produtos de forma estruturada
dentro de um sistema.*/

// Anotação que marca esta classe como uma entidade, o que significa que ela será mapeada para uma tabela no banco de dados
@Entity
public class Produto {
	
	// Atributo que representa o identificador único do produto no banco de dados
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define como o valor do ID será gerado automaticamente
	private Long id;
	
	// Atributo para armazenar o nome do produto, com validações para tamanho e obrigatoriedade
	@NotNull(message = "Campo obrigatório") // Obrigatório
	@Size(min = 2, max = 254, message="Nome deve conter entre 2 e 254 caracteres") // Tamanho entre 2 e 254 caracteres
	private String nome;
	
	// Atributo para armazenar a quantidade disponível do produto, com validação para valor mínimo
	@Min(0) // Valor mínimo de 0
	private int quantidade;
	
	// Atributo para armazenar o preço do produto, com validação para valor mínimo
	@Min(0) // Valor mínimo de 0
	private double preco;
	
	// Atributo para armazenar a descrição do produto
	private String descricaoProduto;
	
	// Atributo para armazenar a URL da imagem do produto
	private String urlImagem;
	
	// Métodos para acessar e modificar os atributos
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
}
