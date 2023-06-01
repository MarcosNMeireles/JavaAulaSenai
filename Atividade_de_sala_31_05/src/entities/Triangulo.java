package entities;

public class Triangulo {
	public double lado1;
	public double lado2;
	public double lado3;

	// Construtor da classe Triangulo
	public Triangulo(double lado1, double lado2, double lado3) {
		// O construtor recebe os valores dos lados do triângulo e os armazena nos atributos da classe
       
	}

	public String verificarTriangulo() {
		if (lado1 == lado2 && lado2 == lado3) {
			// Verifica se os três lados são iguais, caso afirmativo,
			// é um triângulo equilátero	
			return "equilátero";
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			// Verifica se pelo menos dois lados são iguais, caso afirmativo,
			// é um triângulo isósceles
			return "isósceles";
		} else {
			// Se não for nenhum dos casos anteriores, 
			// é um triângulo escaleno (todos os lados diferentes)
			return "escaleno";
		}
	}
}
