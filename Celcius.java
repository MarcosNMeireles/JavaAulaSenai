package Atividades;

import java.util.Scanner;

public class Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner leia = new Scanner (System.in);

			double F, C; 
			
			System.out.println("Senhor usu�rio digite a temperatura em Celsius: ");
			C = leia.nextDouble();
			
			
			F = (C*9/5)+32;
			System.out.println("A temperatura em Fahrenheit �: " +F);
			 
			
			leia.close();

		}
	}


