package atividade_sala120523;

import java.util.Scanner;

public class bissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = input.nextInt();

		if (ano % 4 == 0)
			System.out.println(ano + " é um ano bissexto!");

		else
			System.out.println(ano + " não é um ano bissexto!");
		input.close();
	}
}
