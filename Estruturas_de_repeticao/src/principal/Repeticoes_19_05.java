package principal;

import java.util.Scanner;

public class Repeticoes_19_05 {

	public static void main(String[] args) {
		// usado quando sabemos a quantidade de vezes
		// que irá repetir
		System.out.println("Usando o For");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("****************");
		int i = 0;

		// usado quando NÃO sabemos a quantidade
		// de vezes que iremos repetir
		
		System.out.println("Usando o While");
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Deseja continuar? ");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while (opcao == 's') {
			j++;
			System.out.println("Deseja continuar? ");
			opcao = sc.next().charAt(0);
		}
		System.out.println("Entrou no while \n" + j+ " vezes");

		//do while
		// ele garante que será execultado o bloco de códigos
		//ao menos 1 vez
		int k = 0;
		do {
			System.out.println("Deseja continuar? ");
			opcao = sc.next().charAt(0);
			k++;
			// comando para converter o caracter em letra maiúscula 
		} while (Character.toUpperCase(opcao) == 'S');
		System.out.println("Entrou no do while \n" + k+ " vezes");
		
		sc.close();

	}

}
