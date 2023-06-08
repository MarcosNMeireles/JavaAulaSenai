/*Crie uma classe produto contendo os 
atributos:
	- descri��o
	- quantidade
	- pre�o
	- valor total em estoque.

Pense em uma forma de atualizar o valor total em estoque atrav�s de 2 m�todos
igual ao exemplo de conta que fizemos.

Mostre os dados na tela, 
fa�a uma inser��o dos dados e mostre os dados novamente
depois fa�a uma venda e mostre novamente os dados atualizados. 

Lembre-se de usar o private para os atributos e os 
m�todos get e set para cada atributo que possa ser acessado.*/

package principal;

import java.util.Scanner;

import javax.swing.DefaultListCellRenderer;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicitando ao us�ario o nome do produto a ser cadastrado
		System.out.println("Digite o nome do produto: ");
		String nomeProduto = sc.nextLine();

		// A quantidade do produto
		System.out.println("Qual a quantidade de " + nomeProduto + ": ");
		int quantidadeProduto = sc.nextInt();

		// O valor do produto
		System.out.println("Qual o valor unit�rio do produto: ");
		double precoProduto = sc.nextDouble();

		// Cria um objeto Produto e atribui os valores recebidos anteriormente
		Produto produto = new Produto(nomeProduto, quantidadeProduto, precoProduto);

		// Exibe os dados iniciais do estoque
		System.out.println("Dados Iniciais:");
		
		//Busca o valor "String" da descri��o
		System.out.println("Descri��o: " + produto.getDescricao());
		
		//Busca o valor "Int" do estoque
		System.out.println("Quantidade: " + produto.getQuantidade());
		
		//Busca o valor "double" do pre�o do produto
		System.out.println("Pre�o: R$" + produto.getPreco());
		
		//Retorna o valor "double" do estoque quantidade * pre�o 
		System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n");

		// Variav�l para saber se ocorrerar venda ou n�o
		int vender = 1;
		
		
		//Um la�o de repeti��o para realizar a tarefa enquanto a op��o n�o for "0 - encerrar"
		do {
			
			//Apresenta ao usu�rio a op��o de escolher o que deseja fazer 
			System.out.println("Escolha a op��o desejada: ");
			System.out.println("1 - para vender \n2 - para comprar \n0 - para encerrar: \n");
			vender = sc.nextInt();

			switch (vender) {
			
			//Caso a op��o escolhida seja a "0" apresenta o estoque com os valores recebidos anteriormente
			// repassados ao metodo
			case 0:
				System.out.println("Dados Finais:");
				System.out.println("Descri��o: " + produto.getDescricao());
				System.out.println("Quantidade: " + produto.getQuantidade());
				System.out.println("Pre�o: R$" + produto.getPreco());
				System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n \n");
				break;

			case 1:
				System.out.println("Qual a quantidade a ser vendida: ");
				int vendaProduto = sc.nextInt(); // Variavel para receber a quantidade de produtos vendidos
				produto.vender(vendaProduto); // Passando o valor para o metodo "vender" 

				// Exibe os dados ap�s a venda
				System.out.println("Dados ap�s a Venda:");
				System.out.println("Descri��o: " + produto.getDescricao());
				System.out.println("Quantidade: " + produto.getQuantidade());
				System.out.println("Pre�o: R$" + produto.getPreco());
				System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n \n");

				System.out.println("Escolha a op��o desejada: \n \n");
				break;

			case 2:
				System.out.println("Qual a quantidade a comprada: ");
				int compraProduto = sc.nextInt(); // Variavel para receber a quantidade de procutos comprados
				produto.comprar(compraProduto); // Passando o valor para o metodo "comprar"

				// Exibe os dados ap�s a compra
				System.out.println("Dados ap�s a Compra:");
				System.out.println("Descri��o: " + produto.getDescricao());
				System.out.println("Quantidade: " + produto.getQuantidade());
				System.out.println("Pre�o: R$" + produto.getPreco());
				System.out.println("Valor Total em Estoque: R$" + produto.getValorTotalEstoque() + "\n \n");
				break;

			default:
				// caso seja escolhida uma op��o invalida
				System.out.println("OP��O INVALIDA \n");
				System.out.println("Escolha a op��o desejada: \n \n");
				break;
			}

		} while (vender != 0); //O la�o se repete enquanto a op��o for diferente de "0"

		sc.close();
	}

}
