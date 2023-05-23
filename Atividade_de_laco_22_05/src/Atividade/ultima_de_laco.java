// Faça um programa que receba o tipo de operação a ser realizada 
//(soma, divisão, multiplicação, subtração) 
// e imprima a tabuada desse número. ex.: 1x2 = 2, 1x3 = 3


package Atividade;

import java.util.Scanner;

public class ultima_de_laco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tipo de operação (+, /, *, -): ");
		String operacao = sc.nextLine();
		System.out.println("Digite o número que deseja a tabuada");
		int numero = sc.nextInt();
		
		if (numero != 0) {

		for (int i = 1; i <= 10; i++) {

			switch (operacao) {
			case "+":
				System.out.println(numero + " + " + i + " = " + (i + numero));
				break;
			case "/":
				System.out.println((numero * i) + " / " + numero + " = " + i);
				break;
			case "*":
				System.out.println(numero + " x " + i + " = " + (i * numero));
				break;
			case "-":
				System.out.println((i + numero) + " - " + numero + " = " + i);
				break;
			default:
				System.out.println("Operação inválida. Tente novamente.");
				break;
			}
		}
		}
		sc.close();

	}

}
