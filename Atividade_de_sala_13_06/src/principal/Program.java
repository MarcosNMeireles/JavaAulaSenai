package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		List<Pessoas> listaPessoas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Pessoas pessoa = new Pessoas (nome, idade, telefone);
		

		// Cadastrando pessoas
		System.out.println("Digite o nome da pessoa:");
		listaPessoas.add()
		do {
		System.out.println("Digite o nome da pessoa");
			
		}
		while
		
		Pessoas pessoa1 = new Pessoas("João", 30, "111111111");
		listaPessoas.add(pessoa1);

		Pessoas pessoa2 = new Pessoas("Maria", 25, "222222222");
		listaPessoas.add(pessoa2);

		Pessoas pessoa3 = new Pessoas("Pedro", 40, "333333333");
		listaPessoas.add(pessoa3);

		// Imprimindo pessoas cadastradas
		for (Pessoas pessoa : listaPessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println();
		}
		
		sc.close();	

	}

}
