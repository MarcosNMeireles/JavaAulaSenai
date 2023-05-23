// Fa�a um programa que receba o tipo de opera��o a ser realizada 
//(soma, divis�o, multiplica��o, subtra��o) 
// e imprima a tabuada desse n�mero. ex.: 1x2 = 2, 1x3 = 3


package Atividade;

import java.util.Scanner;

public class ultima_de_laco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		        System.out.print("Digite o tipo de opera��o (+, /, *, -): ");
		        String operacao = sc.nextLine();

		        for (int numero = 1; numero <= 10; numero++) {
		            int resultado = 0;

		            switch (operacao) {
		                case "+":
		                    resultado = numero + 2;
		                    System.out.println(numero + " + 2 = " + resultado);
		                    break;
		                case "/":
		                    resultado = numero / 2;
		                    System.out.println(numero + " / 2 = " + resultado);
		                    break;
		                case "*":
		                    resultado = numero * 2;
		                    System.out.println(numero + " x 2 = " + resultado);
		                    break;
		                case "-":
		                    resultado = numero - 2;
		                    System.out.println(numero + " - 2 = " + resultado);
		                    break;
		                default:
		                    System.out.println("Opera��o inv�lida. Tente novamente.");
		                    break;
		            }
		        }

		        sc.close();
		    
		


	}

}
