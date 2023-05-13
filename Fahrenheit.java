package Atividades;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);

		double F, C; 
		
		System.out.println("Senhor usuário digite a temperatura em Fahrenheit: ");
		F = leia.nextDouble();
		
		C = 5*((F-32)/9);
		
		System.out.println("A temperatura em Celsius é: " +C);
		 
		
		leia.close();

	}

}
