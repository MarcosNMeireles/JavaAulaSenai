/**faça um programa que receba 50 números, 
mostre os números pares  contidos em cada 
posição do vetor e a sua posição (indice) do vetor;
*/

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[50];
        
        // Receber os 50 números
        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        // Exibir os números pares e suas posições
        System.out.println("Números pares encontrados:");
        for (int i = 0; i < 50; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Número: " + numeros[i] + ", Índice: " + i);
            }
        }
        
        sc.close();
    }
}
