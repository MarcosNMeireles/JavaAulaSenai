package principal;

import java.util.Scanner;

import entities.Triangulo;

public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicita ao usuário que digite os valores dos lados do triângulo
		System.out.println("Digite o valor do primeiro lado do triângulo: ");
		double lado1 = sc.nextDouble();

		System.out.println("Digite o valor do segundo lado do triângulo: ");
		double lado2 = sc.nextDouble();

		System.out.println("Digite o valor do terceiro lado do triângulo: ");
		double lado3 = sc.nextDouble();

		// Criação de um objeto(triangulo) Triangulo com os valores informados que são 
		// passados a classe "Triangulo" onde são feitas as verificações e retornado o resultado.
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

		// Verifica o tipo de triângulo chamando o método "verificarTriangulo" da classe
		// "Triangulo". Criando uma variavél local "tipoTriangulo"
		String tipoTriangulo = triangulo.verificarTriangulo();

		// Exibe o resultado
		System.out.println("Os lados formam um triângulo " + tipoTriangulo);

		// Fecha o Scanner
		sc.close();
	}
}
