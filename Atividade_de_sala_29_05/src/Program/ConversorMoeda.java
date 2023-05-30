/*1) Fa�a um programa que receba um valor em real e converta para d�lares na cota��o
atual, fa�a o inverso tamb�m;*/

package Program;

import java.util.Scanner;

public class ConversorMoeda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, informe o valor da cota��o da moeda D�lar em Reais: ");
		System.out.println("Formato a ser usado 00,00");
		double cotacao = sc.nextDouble(); // Cota��o do d�lar em reais

		System.out.println("Voc� deseja converter \n" + "1 - D�lar para Real ou\n" + "2 - Real para D�lar");

		System.out.println("Escolha 1 ou 2: ");
		int opcao = sc.nextInt(); // Escolha da op��o de convers�o

		switch (opcao) {
		case 1:
			System.out.println("CONVERS�O DE D�LAR PARA REAL");
			System.out.println("Quantos d�lares deseja converter: ");
			double dolar = sc.nextDouble(); // Valor em d�lares
			dolarReal(dolar, cotacao); // Passando o valor de dolar e a cota��o para a fun��o

			break;
		case 2:
			System.out.println("CONVERS�O DE REAIS PARA D�LAR");
			System.out.println("Quantos Reais deseja converter: ");
			double real = sc.nextDouble(); // Valor em reais

			RealDolar(real, cotacao);

			break;
		default:
			System.out.println("OP��O INV�LIDA");
			break;
		}
		sc.close();
	}

	// Fun��o Convers�o de D�LAR PARA REAL
	public static double dolarReal(double d, double c) {
		double valorEmReal = d * c;

		System.out.println("O Valor em Real �: R$" + valorEmReal);
		return valorEmReal;
	}

	// Fun��o Convers�o de REAIS PARA D�LAR
	public static double RealDolar(double r, double c) {
		double valorEmDolar = r / c;

		System.out.println("O Valor em Real �: R$" + valorEmDolar);
		return valorEmDolar;
	}
}
