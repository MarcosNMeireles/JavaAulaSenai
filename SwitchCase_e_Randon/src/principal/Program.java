package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random randon = new Random();
		//A variavel ira receber um n�mero aleat�rio entre 1 a 8
		int opcao = randon.nextInt (7);
		
		System.out.println("o n�mero �: " +opcao);

		switch (opcao) {
		case 1:
			System.out.println("o dia selecionado � domingo");
			break;
		case 2:
			System.out.println("o dia selecionado � segunda-feira");
			break;
		case 3:
			System.out.println("o dia selecionado � ter�a-feira");
			break;
		case 4:
			System.out.println("o dia selecionado � quarta-feira");
			break;
		case 5:
			System.out.println("o dia selecionado � quinta-feira");
			break;
		case 6:
			System.out.println("Sextou!!");
			break;
		case 7:
			System.out.println("o dia selecionado � S�bado");
			break;
		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
		}
		 
		/*
		 * switch (opcao) { case "Quarta-feira":
		 * System.out.println("o dia selecionado � quarta-feira"); break; case
		 * "Quinta-feira": System.out.println("o dia selecionado � quinta-feira");
		 * break; case "Sexta-feira": System.out.println("Sextou!!"); break; default:
		 * System.out.println("N�o corresponde a um dia da semana"); break; }
		 */
		
		/*
		 * if (opcao == "Quarta-feira") {
		 * System.out.println("o dia selecionado � quarta-feira"); } else if (opcao ==
		 * "Quinta-feira"){ System.out.println("o dia selecionado � quinta-feira"); } //
		 * No caso de String podemos usar tamb�m a op��o do "equals". else if
		 * (opcao.equals("Sexta-feira")){ System.out.println("Sextou!!"); } else {
		 * System.out.println("N�o corresponde a um dia da semana"); }
		 */
		
	}

}
