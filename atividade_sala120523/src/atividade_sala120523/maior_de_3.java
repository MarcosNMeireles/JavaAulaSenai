package atividade_sala120523;

import java.util.Scanner;

public class maior_de_3 {
//private static double numero[];	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		double[] numero = new double[4];
		//double maior = 0;
		numero[3] = 0;
		for (int contador = 0; contador < 3; contador++) {
			System.out.println("Digite o " + (contador + 1) + "º número: ");
			numero[contador] = leia.nextDouble();
			if (numero[contador] > numero[3])
				numero[3] = numero[contador];
		}

		System.out.println("O maior número é: " + numero[3]);

		leia.close();
	}
}
