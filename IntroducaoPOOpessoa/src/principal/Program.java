package principal;

import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoas pessoa = new Pessoas ();
		Pessoas pessoa2 = new Pessoas ();
		
	/*for (int i =0; i <3 ; i++);
		System.out.println("Digite o nome: ");
		pessoa.nome[i] = sc.nextString();
	*/
		
		
		
		  pessoa.nome = "mario andrade"; 
		  pessoa.idade = 56; 
		  pessoa.sexo = "masculino";
		  
		  pessoa2.nome = "Pernabuco Suares"; 
		  pessoa2.idade = 81; 
		  pessoa2.sexo =
		  "masculino";
		  
		  System.out.println("O nome é: " +pessoa.nome+ "\n sua idade é: "
		  +pessoa.idade+ "\n Sexo: " +pessoa.sexo); 
		  
		  System.out.println("O nome é: "
		  +pessoa2.nome+ "\n sua idade é: " +pessoa2.idade+ "\n Sexo: " +pessoa2.sexo);
		 
	}

}
