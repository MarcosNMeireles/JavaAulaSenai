/*2) Fa�a um programa, com uma fun��o que 
necessite de tr�s argumentos, e que forne�a a soma desses tr�s argumentos*/


package Program;


import java.util.Scanner;

import principal.Program;

public class Tres_argumentos {

	public static void main(String[] args) {
		/ TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o primeiro numero da soma: ");
		int numero1 = sc.nextInt();
		System.out.println("Entre com o primeiro numero da soma: ");
		int numero2 = sc.nextInt();
		somaDoisNumeros(numero1, numero2);
		System.out.println("Abaixo os numeros atribuidos manualmente");
		somaDoisNumeros (10,20);
		Program.mensagem2(25);
		
	}
	
	static void somaDoisNumeros (int x, int y) {
		int resultado = x + y;
		System.out.println("O resultado da soma �: " +resultado);
		System.out.println("Outra forma de mostrar o resultado da soma: " +(x+y));
	}
		
		
		


	

}
