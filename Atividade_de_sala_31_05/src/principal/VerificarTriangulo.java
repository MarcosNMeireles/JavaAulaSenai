package principal;

import java.util.Scanner;

import entities.Triangulo;

public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicita ao usu�rio que digite os valores dos lados do tri�ngulo
		System.out.println("Digite o valor do primeiro lado do tri�ngulo: ");
		double lado1 = sc.nextDouble();

		System.out.println("Digite o valor do segundo lado do tri�ngulo: ");
		double lado2 = sc.nextDouble();

		System.out.println("Digite o valor do terceiro lado do tri�ngulo: ");
		double lado3 = sc.nextDouble();

		// Cria��o de um objeto(triangulo) Triangulo com os valores informados que s�o 
		// passados a classe "Triangulo" onde s�o feitas as verifica��es e retornado o resultado.
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

		// Verifica o tipo de tri�ngulo chamando o m�todo "verificarTriangulo" da classe
		// "Triangulo". Criando uma variav�l local "tipoTriangulo"
		String tipoTriangulo = triangulo.verificarTriangulo();

		// Exibe o resultado
		System.out.println("Os lados formam um tri�ngulo " + tipoTriangulo);

		// Fecha o Scanner
		sc.close();
	}
}
