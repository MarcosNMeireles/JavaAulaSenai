package principal;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		int[] numeros2 = { 100, 250, 02, 25, 88 };

		numeros[0] = 10;
		numeros[1] = 25;
		numeros[2] = 1;
		numeros[3] = 99;
		numeros[4] = 33;

		System.out.println(numeros[4]);
		System.out.println(numeros2[2]);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos nome deseja salva? ");
		int qtd = sc.nextInt();
		sc.nextLine();
		String[] nomes = new String[qtd];
		//FOR para inserir os dados
		for (int contador = 0; contador < nomes.length; contador++) {
			System.out.println("Entre com o nome: ");
			nomes[contador] = sc.nextLine();
		}
		
		//FOR usando para exibir os dados
		for (int contador = 0; contador < nomes.length; contador++) {
			System.out.println(nomes[contador]+" \n");
		}
		// uma op��o de exibir o la�o for anterior
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		//comparando se o valor da String � igual ou n�o ao valor atribuido
		String verificar = "marcos";
		
		if (nomes[0].equals(verificar)) {
			System.out.println("� igual\n");
		}
		
		
		
		sc.close();

	}

}
