package entities;


public class Pessoas {

	public String nome;
	public int idade;
	public String telefone;

	public Pessoas(String nome, int idade, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getTelefone() {
		return telefone;
	}
}

