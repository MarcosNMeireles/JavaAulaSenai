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

package principal;

import java.util.Scanner;

import javax.swing.DefaultListCellRenderer;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicitando ao usúario o nome do produto a ser cadastrado
		System.out.println("Digite o nome do produto: ");
		String nomeProduto = sc.nextLine();

		// A quantidade do produto
		System.out.println("Qual a quantidade de " + nomeProduto + ": ");
		int quantidadeProduto = sc.nextInt();

		// O valor do produto
		System.out.println("Qual o valor unitário do produto: ");
		double precoProduto = sc.nextDouble();

		// Cria um objeto Produto e atribui os valores recebidos anteriormente
		Produto produto = new Produto(nomeProduto, quantidadeProduto, precoProduto);

		// Exibe os dados iniciais do estoque
		System.out.println("Dados Iniciais:");
		
		//Busca o valor "String" da descrição
		System.out.println("Descrição: " + produto.getDescricao());
		
		//Busca o valor "Int" do estoque
		System.out.println("Quantidade: " + produto.getQuantidade());
		
		//Busca o valor "double" do preço do produto
		System.out.println("Preço: R$" + produto.getPreco());
		
		//Retorna o valor "double" do estoque quantidade * preço 
		System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n");

		// Variavél para saber se ocorrerar venda ou não
		int vender = 1;
		
		
		//Um laço de repetição para realizar a tarefa enquanto a opção não for "0 - encerrar"
		do {
			
			//Apresenta ao usuário a opção de escolher o que deseja fazer 
			System.out.println("Escolha a opção desejada: ");
			System.out.println("1 - para vender \n2 - para comprar \n0 - para encerrar: \n");
			vender = sc.nextInt();

			switch (vender) {
			
			//Caso a opção escolhida seja a "0" apresenta o estoque com os valores recebidos anteriormente
			// repassados ao metodo
			case 0:
				System.out.println("Dados Finais:");
				System.out.println("Descrição: " + produto.getDescricao());
				System.out.println("Quantidade: " + produto.getQuantidade());
				System.out.println("Preço: R$" + produto.getPreco());
				System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n \n");
				break;

			case 1:
				System.out.println("Qual a quantidade a ser vendida: ");
				int vendaProduto = sc.nextInt(); // Variavel para receber a quantidade de produtos vendidos
				produto.vender(vendaProduto); // Passando o valor para o metodo "vender" 

				// Exibe os dados após a venda
				System.out.println("Dados após a Venda:");
				System.out.println("Descrição: " + produto.getDescricao());
				System.out.println("Quantidade: " + produto.getQuantidade());
				System.out.println("Preço: R$" + produto.getPreco());
				System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n \n");

				System.out.println("Escolha a opção desejada: \n \n");
				break;

			case 2:
				System.out.println("Qual a quantidade a comprada: ");
				int compraProduto = sc.nextInt(); // Variavel para receber a quantidade de procutos comprados
				produto.comprar(compraProduto); // Passando o valor para o metodo "comprar"

				// Exibe os dados após a compra
				System.out.println("Dados após a Compra:");
				System.out.println("Descrição: " + produto.getDescricao());
				System.out.println("Quantidade: " + produto.getQuantidade());
				System.out.println("Preço: R$" + produto.getPreco());
				System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n \n");
				break;

			default:
				// caso seja escolhida uma opção invalida
				System.out.println("OPÇÃO INVALIDA \n");
				System.out.println("Escolha a opção desejada: \n \n");
				break;
			}

		} while (vender != 0); //O laço se repete enquanto a opção for diferente de "0"

		sc.close();
	}

}
