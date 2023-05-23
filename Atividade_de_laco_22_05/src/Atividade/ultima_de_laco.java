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
		float numero2 = sc.nextInt();

		for (int numero = 1; numero <= 10; numero++) {
			float resultado = 0;

			switch (operacao) {
			case "+":

				resultado = numero + numero2;
				System.out.println(numero + " + " + numero2 + " = " + resultado);

				break;
			case "/":
				resultado = numero / numero2;

				System.out.println(numero + " / " + numero2 + " = " + resultado);
				break;
			case "*":
				resultado = numero * numero2;
				System.out.println(numero + " x " + numero2 + " = " + resultado);
				break;
			case "-":
				resultado = numero - numero2;
				System.out.println(numero + " - " + numero2 + " = " + resultado);
				break;
			default:
				System.out.println("Operação inválida. Tente novamente.");
				break;
			}
		}

		sc.close();

	}

}
