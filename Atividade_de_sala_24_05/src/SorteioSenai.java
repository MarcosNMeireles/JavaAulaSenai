/**Usando o random faça uma simulação de um sorteio, 
cadastrando 10 pessoas, apenas uma pessoa será a 
ganhadora para a proxima turma de java do senai;
*/

import java.util.Random;
import java.util.Scanner;

public class SorteioSenai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] participantes = new String[10];
        
        // Cadastro dos 10 participantes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do participante " + (i + 1) + ": ");
            String nome = sc.nextLine();
            participantes[i] = nome;
        }
        
        // Sorteio do ganhador
        Random random = new Random();
        
        // Gera um número aleatório entre 0 e 9
        int indiceGanhador = random.nextInt(10); 
        
        // Exibição do ganhador
        System.out.println("O ganhador da próxima turma de Java do Senai é: " + participantes[indiceGanhador]);
        
        sc.close();
    }
}
