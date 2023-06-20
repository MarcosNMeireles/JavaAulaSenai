package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<>();

		// Coleta as informa��es dos alunos
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno " + (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("S�rie: ");
			int serie = Integer.parseInt(scanner.nextLine());

			List<Double> notas = new ArrayList<>();
			for (int j = 1; j <= 4; j++) {
				System.out.print("Nota " + j + ": ");
				double nota = Double.parseDouble(scanner.nextLine());
				notas.add(nota);
			}

			Aluno aluno = new Aluno(nome, serie, notas);
			alunos.add(aluno);
		}

		System.out.println("\nM�dias dos alunos:");

		// Calcula e imprime a m�dia de cada aluno
		for (Aluno aluno : alunos) {
			System.out.println("Aluno: " + aluno.getNome() + " | M�dia: " + aluno.calcularMedia());
		}
	}
}