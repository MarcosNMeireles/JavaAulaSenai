/**fa�a um programa que receba 50 n�meros, 
mostre os n�meros pares  contidos em cada 
posi��o do vetor e a sua posi��o (indice) do vetor;
*/

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[50];
        
        // Receber os 50 n�meros
        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o n�mero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        // Exibir os n�meros pares e suas posi��es
        System.out.println("N�meros pares encontrados:");
        for (int i = 0; i < 50; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("N�mero: " + numeros[i] + ", �ndice: " + i);
            }
        }
        
        sc.close();
    }
}
