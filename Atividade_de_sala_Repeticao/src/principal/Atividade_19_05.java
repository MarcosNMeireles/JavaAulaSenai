package principal;

import java.util.Scanner;

//1.Fa�a um programa que leia a altura de 5 pessoas e 
//mostre a media de altura entre elas;
//
//
//2.Fa�a um programa onde o 1 � sim e 0 � n�o, 
//toda vez que for sim entre em um bloco de c�digo e some mais 1 a uma
//vari�vel contadora;
//
//
//3.Fa�a o mesmo programa do exerc�cio 1 mas usando while;

public class Atividade_19_05 {

	public static void main(String[] args) {

		// 1.Fa�a um programa que leia a altura de 5 pessoas e
		// mostre a media de altura entre elas;

		Scanner sc = new Scanner(System.in);

		System.out.println(" ************** exerc�cio 1 **************\n");
		double media = 0, altura = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a altura da " + (i + 1) + " pessoa: \n");
			altura = sc.nextDouble();
			media += altura;
		}

		System.out.println("A m�dia de altura �: " + (media / 5));

		System.out.println(" ************** exerc�cio 2 **************\n");
		// 2.Fa�a um programa onde o 1 � sim e 0 � n�o,
		// toda vez que for sim entre em um bloco de c�digo e some mais 1 a uma
		// vari�vel contadora;

		int i = 0;
		int opcao = 0;

		do {

			System.out.println("Digite 1 para continuar ou \n     0 para encerrar:");
			opcao = sc.nextInt();
						
			i++;

			// comando para converter o caracter em letra mai�scula
		} while (opcao != 0);
		System.out.println("Voc� continuou " + i + " vezes");

		System.out.println(" ************** exerc�cio 3 **************\n");
		// 3.Fa�a o mesmo programa do exerc�cio 1 mas usando while;

		media = 0;
		altura = 0;
		i = 0;

		while (i < 5) {
			i++;
			System.out.println("Digite a altura da " + i + " pessoa: \n");
			altura = sc.nextDouble();
			media += altura;
		}

		System.out.println("A m�dia de altura �: " + (media / 5));

		System.out.println(" ************** fim dos exerc�cios **************");
	}

}
