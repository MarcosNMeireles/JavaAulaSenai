/*2) Fa�a um programa, com uma fun��o que 
necessite de tr�s argumentos, e que forne�a a soma desses tr�s argumentos*/

package Program;

import java.util.Scanner;

public class Tres_argumentos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] numero = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com o " + (i + 1) + "� numero soma: ");
			numero[i] = sc.nextDouble();
		}

		somaTresNumeros(numero[0], numero[1], numero[2]);
		sc.close();
	}

	public static void somaTresNumeros(double x, double y, double z) {
		double resultado = x + y + z;
		System.out.println("O resultado da soma �: " + resultado);
	}

}
