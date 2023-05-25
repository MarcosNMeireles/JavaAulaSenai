import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SorteioSenai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> participantes = new ArrayList<>();
        
        // Cadastro dos 10 participantes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do participante " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            participantes.add(nome);
        }
        
        // Sorteio do ganhador
        Random random = new Random();
        int indiceGanhador = random.nextInt(10); // Gera um número aleatório entre 0 e 9
        
        // Exibição do ganhador
        System.out.println("O ganhador da próxima turma de Java do Senai é: " + participantes.get(indiceGanhador));
        
        scanner.close();
    }
}
