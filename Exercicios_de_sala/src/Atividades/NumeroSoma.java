package Atividades;

import java.util.Scanner;

public class NumeroSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int numero[] = {1,2,3};
		
		System.out.println("Senhor usuário digite um número:");
		numero[0] = leia.nextInt();
		
		System.out.println("Senhor usuário digite outro número:");
		numero[1] = leia.nextInt();
		 
		int soma = numero[0] + numero[1];
		 System.out.println("A soma é: "+soma);
		
		
		 leia.close();
	}

}
