/*1) Faça um programa que receba um valor em real e converta para dólares na cotação
atual, faça o inverso também;*/

package Program;

import java.util.Scanner;

public class ConversorMoeda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, informe o valor da cotação da moeda Dólar em Reais: ");
		System.out.println("Formato a ser usado 00,00");
		double cotacao = sc.nextDouble(); // Cotação do dólar em reais

		System.out.println("Você deseja converter \n" + "1 - Dólar para Real ou\n" + "2 - Real para Dólar");

		System.out.println("Escolha 1 ou 2: ");
		int opcao = sc.nextInt(); // Escolha da opção de conversão

		switch (opcao) {
		case 1:
			System.out.println("CONVERSÃO DE DÓLAR PARA REAL");
			System.out.println("Quantos dólares deseja converter: ");
			double dolar = sc.nextDouble(); // Valor em dólares
			dolarReal(dolar, cotacao); // Passando o valor de dolar e a cotação para a função

			break;
		case 2:
			System.out.println("CONVERSÃO DE REAIS PARA DÓLAR");
			System.out.println("Quantos Reais deseja converter: ");
			double real = sc.nextDouble(); // Valor em reais

			RealDolar(real, cotacao);

			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
		sc.close();
	}

	// Função Conversão de DÓLAR PARA REAL
	public static double dolarReal(double d, double c) {
		double valorEmReal = d * c;

		System.out.println("O Valor em Real é: R$" + valorEmReal);
		return valorEmReal;
	}

	// Função Conversão de REAIS PARA DÓLAR
	public static double RealDolar(double r, double c) {
		double valorEmDolar = r / c;

		System.out.println("O Valor em Real é: R$" + valorEmDolar);
		return valorEmDolar;
	}
}
