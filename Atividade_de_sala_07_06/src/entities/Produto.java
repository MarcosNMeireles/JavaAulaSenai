/*Crie uma classe produto contendo os 
atributos:
	- descrição
	- quantidade
	- preço
	- valor total em estoque.

Pense em uma forma de atualizar o valor total em estoque através de 2 métodos
igual ao exemplo de conta que fizemos.

Mostre os dados na tela, 
faça uma inserção dos dados e mostre os dados novamente
depois faça uma venda e mostre novamente os dados atualizados. 

Lembre-se de usar o private para os atributos e os 
métodos get e set para cada atributo que possa ser acessado.*/




package entities;

public class Produto {

	private String descricao;
	private int quantidade;
	private double preco;
	private double valorTotalEstoque;

	// Construtor da classe Produto
	public Produto(String descricao, int quantidade, double preco) {
		//determinando que a variavel é dessa classe e qual o valor será recebido e qual a ordem
		this.descricao = descricao; 
		this.quantidade = quantidade;
		this.preco = preco;
		this.valorTotalEstoque = quantidade * preco; // Calcula o valor total inicial do estoque
	}

	// Método para atualizar o valor total em estoque após uma compra
	public void comprar(int quantidadeComprada) {
		quantidade += quantidadeComprada; // Atualiza a quantidade em estoque
		valorTotalEstoque = quantidade * preco; // Recalcula o valor total em estoque
	}

	// Método para atualizar o valor total em estoque após uma venda
	public void vender(int quantidadeVendida) {
		quantidade -= quantidadeVendida; // Atualiza a quantidade em estoque
		valorTotalEstoque = quantidade * preco; // Recalcula o valor total em estoque
	}

	// Métodos getters e setters para os atributos

	// retorna o nome do produto cadastrado
	public String getDescricao() {
		return descricao;
	}
	
	//Para atualizar o nome do produto
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//Retorna o valor da quantidade do produto em estoque
	public int getQuantidade() {
		return quantidade;
	}
	
	//Atualiza o valor da quantidade do produto em estoque
	//Normalmente feito no início do programa não podendo ser alterado diretamente
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//Retorna o valor do preço do produto em estoque
	public double getPreco() {
		return preco;
	}
	
	
	//Permite atualizar o preço do produto
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//Retorna o valor total em estoque 
	public double getValorTotalEstoque() {
		return valorTotalEstoque;
	}

	//Permite atribuir um valor ao estoque
	public void setValorTotalEstoque(double valorTotalEstoque) {
		this.valorTotalEstoque = valorTotalEstoque;
	}

}
