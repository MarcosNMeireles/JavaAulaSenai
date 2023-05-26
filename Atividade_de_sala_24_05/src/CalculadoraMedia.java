/**Faça um programa que receba o nome do
aluno e as 4 notas bimestrais desse aluno e mostre a media;*/


import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Receber o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        
        // Receber as notas bimestrais
        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = sc.nextDouble();
        }
        
        // Calcular a média
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
               
        // Mostrar a média
        System.out.println("Média do aluno " + nomeAluno + ": " + (soma/4));
        
        sc.close();
    }
}
