import java.util.Scanner;

public class AnoNascimento {

	
	//public class CalculaIdade {
	  public static void main(String[] args) {
		  
		Scanner leia = new Scanner (System.in);
		int anoNasc, anoAtual;
		
		System.out.println("Senhor usu�rio digite o ano de nascimento:");
		anoNasc = leia.nextInt();
		
		System.out.println("Senhor usu�rio digite o ano Atual:");
		anoAtual = leia.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		System.out.println("Sua idade � " + idade + " anos.");
	    leia.close();
	  }
	}