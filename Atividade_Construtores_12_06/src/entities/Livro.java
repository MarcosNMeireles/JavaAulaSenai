package entities;

import javax.swing.JOptionPane;

public class Livro {
	/*
	 * Ordem sugerida a seguir na classe: 1º atributos da classe; 2º construtores;
	 * 3º metodos get e set; 4º demais metodos.
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
			this.valor += (valor * 0.3); // Atualiza o valor com a taxa de 30% de imposto, se necessário
		} else {
			this.valor = valor;
		}

	}

	@Override
	public String toString() {

		return "Título: " + titulo + "\n" + "Edição: " + edicao + "\n" + "Valor: R$" + valor;
	}
}
