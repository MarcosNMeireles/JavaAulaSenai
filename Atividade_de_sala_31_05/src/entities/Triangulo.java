package entities;

public class Triangulo {
	public double lado1;
	public double lado2;
	public double lado3;

	// Construtor da classe Triangulo
	public Triangulo(double lado1, double lado2, double lado3) {
		// O construtor recebe os valores dos lados do tri�ngulo e os armazena nos atributos da classe
       
	}

	public String verificarTriangulo() {
		if (lado1 == lado2 && lado2 == lado3) {
			// Verifica se os tr�s lados s�o iguais, caso afirmativo,
			// � um tri�ngulo equil�tero	
			return "equil�tero";
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			// Verifica se pelo menos dois lados s�o iguais, caso afirmativo,
			// � um tri�ngulo is�sceles
			return "is�sceles";
		} else {
			// Se n�o for nenhum dos casos anteriores, 
			// � um tri�ngulo escaleno (todos os lados diferentes)
			return "escaleno";
		}
	}
}
