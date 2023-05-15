package atividade_sala120523;

import java.util.Scanner;

public class nota_aluno {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		double[] notas = new double[4];
		double media = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			notas[i] = leia.nextDouble();
			media += notas[i];
		}
		media /= 4;
	

		
		if (media > 5 && media < 6) {
			System.out.println("Aluno Reprovado, nota: " + media);
		} else if (media > 6 && media < 7) {
			System.out.println("Aluno em Recuperação, nota: " + media);
		} else if (media >= 7 && media < 10) {
			System.out.println("Aluno Aprovado, nota: " + media);
		} else {
			System.out.println("Aluno Aprovado com honras, nota: " + media);
		}
		 
		leia.close();
	}
}
