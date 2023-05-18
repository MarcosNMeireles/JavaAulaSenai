package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random randon = new Random();
		//A variavel ira receber um número aleatório entre 1 a 8
		int opcao = randon.nextInt (7);
		
		System.out.println("o número é: " +opcao);

		switch (opcao) {
		case 1:
			System.out.println("o dia selecionado é domingo");
			break;
		case 2:
			System.out.println("o dia selecionado é segunda-feira");
			break;
		case 3:
			System.out.println("o dia selecionado é terça-feira");
			break;
		case 4:
			System.out.println("o dia selecionado é quarta-feira");
			break;
		case 5:
			System.out.println("o dia selecionado é quinta-feira");
			break;
		case 6:
			System.out.println("Sextou!!");
			break;
		case 7:
			System.out.println("o dia selecionado é Sábado");
			break;
		default:
			System.out.println("Não corresponde a um dia da semana");
			break;
		}
		 
		/*
		 * switch (opcao) { case "Quarta-feira":
		 * System.out.println("o dia selecionado é quarta-feira"); break; case
		 * "Quinta-feira": System.out.println("o dia selecionado é quinta-feira");
		 * break; case "Sexta-feira": System.out.println("Sextou!!"); break; default:
		 * System.out.println("Não corresponde a um dia da semana"); break; }
		 */
		
		/*
		 * if (opcao == "Quarta-feira") {
		 * System.out.println("o dia selecionado é quarta-feira"); } else if (opcao ==
		 * "Quinta-feira"){ System.out.println("o dia selecionado é quinta-feira"); } //
		 * No caso de String podemos usar também a opção do "equals". else if
		 * (opcao.equals("Sexta-feira")){ System.out.println("Sextou!!"); } else {
		 * System.out.println("Não corresponde a um dia da semana"); }
		 */
		
	}

}
