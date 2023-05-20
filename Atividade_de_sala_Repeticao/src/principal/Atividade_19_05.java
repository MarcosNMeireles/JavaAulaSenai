package principal;

import java.util.Scanner;

//1.Faça um programa que leia a altura de 5 pessoas e 
//mostre a media de altura entre elas;
//
//
//2.Faça um programa onde o 1 é sim e 0 é não, 
//toda vez que for sim entre em um bloco de código e some mais 1 a uma
//variável contadora;
//
//
//3.Faça o mesmo programa do exercício 1 mas usando while;

public class Atividade_19_05 {

	public static void main(String[] args) {

		// 1.Faça um programa que leia a altura de 5 pessoas e
		// mostre a media de altura entre elas;

		Scanner sc = new Scanner(System.in);

		System.out.println(" ************** exercício 1 **************\n");
		double media = 0, altura = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a altura da " + (i + 1) + " pessoa: \n");
			altura = sc.nextDouble();
			media += altura;
		}

		System.out.println("A média de altura é: " + (media / 5));

		System.out.println(" ************** exercício 2 **************\n");
		// 2.Faça um programa onde o 1 é sim e 0 é não,
		// toda vez que for sim entre em um bloco de código e some mais 1 a uma
		// variável contadora;

		int i = 0;
		int opcao = 0;

		do {

			System.out.println("Digite 1 para continuar ou \n     0 para encerrar:");
			opcao = sc.nextInt();
						
			i++;

			// comando para converter o caracter em letra maiúscula
		} while (opcao != 0);
		System.out.println("Você continuou " + i + " vezes");

		System.out.println(" ************** exercício 3 **************\n");
		// 3.Faça o mesmo programa do exercício 1 mas usando while;

		media = 0;
		altura = 0;
		i = 0;

		while (i < 5) {
			i++;
			System.out.println("Digite a altura da " + i + " pessoa: \n");
			altura = sc.nextDouble();
			media += altura;
		}

		System.out.println("A média de altura é: " + (media / 5));

		System.out.println(" ************** fim dos exercícios **************");
	}

}
