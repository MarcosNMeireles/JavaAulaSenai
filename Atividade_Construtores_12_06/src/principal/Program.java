package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o título do livro:");
		String titulo = sc.nextLine();

		System.out.println("Informe a edição do livro:");
		String edicao = sc.nextLine();

		System.out.println("Informe o valor do livro:");
		double valor = sc.nextDouble();

		// Cria o objeto Livro com os dados informados, passando os paramentros
		Livro livro = new Livro(titulo, edicao, valor);
		livro.setValor(valor);
		
		System.out.println(livro);
		
		// Exibe os dados do livro cadastrado
		
		sc.close();
	}

}