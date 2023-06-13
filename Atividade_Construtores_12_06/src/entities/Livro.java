package entities;

import javax.swing.JOptionPane;

public class Livro {
	/*
	 * Ordem sugerida a seguir na classe: 1� atributos da classe; 2� construtores;
	 * 3� metodos get e set; 4� demais metodos.
	 */
	private String titulo;
	private String edicao;
	private double valor;

	public Livro(String titulo, String edicao, double valor) {
		super();
		this.titulo = titulo;
		this.edicao = edicao;
		this.valor = valor;

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 100) {
			this.valor += (valor * 0.3); // Atualiza o valor com a taxa de 30% de imposto, se necess�rio
		} else {
			this.valor = valor;
		}

	}

	@Override
	public String toString() {

		return "T�tulo: " + titulo + "\n" + "Edi��o: " + edicao + "\n" + "Valor: R$" + valor;
	}
}
