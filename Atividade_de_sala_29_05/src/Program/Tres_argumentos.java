/*2) Faça um programa, com uma função que 
necessite de três argumentos, e que forneça a soma desses três argumentos*/

package Program;

import java.util.Scanner;

public class Tres_argumentos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] numero = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com o " + (i + 1) + "º numero soma: ");
			numero[i] = sc.nextDouble();
		}

		somaTresNumeros(numero[0], numero[1], numero[2]);
		sc.close();
	}

	public static void somaTresNumeros(double x, double y, double z) {
		double resultado = x + y + z;
		System.out.println("O resultado da soma é: " + resultado);
	}

}
