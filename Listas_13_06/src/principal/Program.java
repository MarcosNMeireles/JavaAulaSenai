package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Criando uma lista de String. Ela n�o precisa ser criada com um tamanho certo
		List <String> nomes = new ArrayList <>();
		
		//Os dados s�o inseridos continuamente
		
		
		nomes.add("Pedro");
		nomes.add("Marcos");
		nomes.add("poti");
		nomes.add("Maria");
		
		
		System.out.println("\nLista em ordem de registro antes da remo��o");
		//cria um contador baseado no tamanho da lista
		for (String nome : nomes) {
			// op��o para exibir todos os valores registrados
			System.out.println("Nome: " +nome);
		}
		
		
		//verificando o dado que esta na posi��o "2" da lista
		System.out.println("\nNome na posi��o 2");
		System.out.println("Nome: " +nomes.get(2));
		
		// remove os dados da lista em uma posi��o definida
		nomes.remove(2);
		
		//verificando o NOVO dado que esta na posi��o "2" da lista
		System.out.println("\nNOVO nome na posi��o 2");
		System.out.println("Nome: " +nomes.get(2));
				
		
		System.out.println("\nLista em ordem de registro ap�s a remo��o");
		for (String nome : nomes) {
			// op��o para exibir todos os valores registrados
			System.out.println("Nome: " +nome);
		}
		
		// exibe o valor em uma posi��o dentro da lista
		System.out.println("Nome: " +nomes.get(2));
		
		
		
		// procurando um valor dentro da lista utilizando predicado "X", mas vale apenas para "String"
		String dado = nomes.stream().filter(x -> x == "Marcos").findFirst().orElse(null);
		
		//classifica a lista em ordem alfabetica.
		Collections.sort(nomes);
		
		System.out.println("\nLista em ordem alfabetica\n");
		for (String nome : nomes) {
			// op��o para exibir todos os valores registrados
			
			System.out.println("Nome: " +nome);
		}
		
		//o valor buscado
		System.out.println("\nvalor localizado: \n" +dado);
		
		//imprimi a lista em forma de array
		System.out.println(nomes);
		
		
	}

}
