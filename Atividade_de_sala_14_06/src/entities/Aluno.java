package entities;

import java.util.List;

public class Aluno {
	private String nome;
	private int serie;
	private List<Double> notas;

	public Aluno(String nome, int serie, List<Double> notas) {
		this.nome = nome;
		this.serie = serie;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public double calcularMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.size();
	}
}
