package Atividades;

import java.util.Scanner;

public class Ganho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);

		double numero[] = {1,2,}, media = 0; 
		
		System.out.println("Senhor usu�rio digite o valor da hora trabalhada: ");
		numero[0] = leia.nextDouble();
		
		System.out.println("Senhor usu�rio digite a quantidade de horas trabalhada: ");
		numero[1] = leia.nextDouble();

		media = numero[0] * numero[1];
		
		System.out.println("O sal�rio mensal �: " +media);
		 
		
		leia.close();

		
	}

}
