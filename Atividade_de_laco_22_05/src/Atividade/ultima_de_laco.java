// Fa�a um programa que receba o tipo de opera��o a ser realizada 
//(soma, divis�o, multiplica��o, subtra��o) 
// e imprima a tabuada desse n�mero. ex.: 1x2 = 2, 1x3 = 3


package Atividade;

import java.util.Scanner;

public class ultima_de_laco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tipo de opera��o (+, /, *, -): ");
		String operacao = sc.nextLine();
		System.out.println("Digite o n�mero que deseja a tabuada");
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
				System.out.println("Opera��o inv�lida. Tente novamente.");
				break;
			}
		}
		}
		sc.close();

	}

}
