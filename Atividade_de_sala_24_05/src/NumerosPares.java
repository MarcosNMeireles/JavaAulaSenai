import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[50];
        
        // Receber os 50 números
        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Exibir os números pares e suas posições
        System.out.println("Números pares encontrados:");
        for (int i = 0; i < 50; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Número: " + numeros[i] + ", Índice: " + i);
            }
        }
        
        scanner.close();
    }
}
