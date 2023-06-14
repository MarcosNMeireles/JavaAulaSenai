package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Criando uma lista de String. Ela não precisa ser criada com um tamanho certo
		List <String> nomes = new ArrayList <>();
		
		//Os dados são inseridos continuamente
		
		
		nomes.add("Pedro");
		nomes.add("Marcos");
		nomes.add("poti");
		nomes.add("Maria");
		
		
		System.out.println("\nLista em ordem de registro antes da remoção");
		//cria um contador baseado no tamanho da lista
		for (String nome : nomes) {
			// opção para exibir todos os valores registrados
			System.out.println("Nome: " +nome);
		}
		
		
		//verificando o dado que esta na posição "2" da lista
		System.out.println("\nNome na posição 2");
		System.out.println("Nome: " +nomes.get(2));
		
		// remove os dados da lista em uma posição definida
		nomes.remove(2);
		
		//verificando o NOVO dado que esta na posição "2" da lista
		System.out.println("\nNOVO nome na posição 2");
		System.out.println("Nome: " +nomes.get(2));
				
		
		System.out.println("\nLista em ordem de registro após a remoção");
		for (String nome : nomes) {
			// opção para exibir todos os valores registrados
			System.out.println("Nome: " +nome);
		}
		
		// exibe o valor em uma posição dentro da lista
		System.out.println("Nome: " +nomes.get(2));
		
		
		
		// procurando um valor dentro da lista utilizando predicado "X", mas vale apenas para "String"
		String dado = nomes.stream().filter(x -> x == "Marcos").findFirst().orElse(null);
		
		//classifica a lista em ordem alfabetica.
		Collections.sort(nomes);
		
		System.out.println("\nLista em ordem alfabetica\n");
		for (String nome : nomes) {
			// opção para exibir todos os valores registrados
			
			System.out.println("Nome: " +nome);
		}
		
		//o valor buscado
		System.out.println("\nvalor localizado: \n" +dado);
		
		//imprimi a lista em forma de array
		System.out.println(nomes);
		
		
	}

}
