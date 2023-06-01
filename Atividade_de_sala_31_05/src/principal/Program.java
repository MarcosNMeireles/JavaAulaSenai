/*Fa�a um programa com a classe AreaTerreno que tem o atributo area e o 
metodo retorna area com os atributos largura e comprimento. 
Na calsse principal pe�a para o usuario entrar com os dados de 
largura e comprimento e retorne o valor do calculo feito no metodo da classe AreaTerreno*/


package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Criando um objeto (areaTerreno) da Classe AreaTerreno
		// Instanciando um novo obejto de area
		AreaTerreno areaTerreno = new AreaTerreno();

		System.out.println("Senhor usu�rio entre com os parametros necess�rios");
		System.out.println("Digite a largura");
		// Acessando o atributo "largura" da Classe AreaTerreno
		areaTerreno.largura = sc.nextDouble();

		System.out.println("Digite o comprimento");
		// Acessando o atributo "comrpimento" da Classe AreaTerreno
		areaTerreno.comprimento = sc.nextDouble();

		// Retorna o valor calculado na fun��o "retornaArea" da Classe AreaTerreno
		System.out.println("A area � :" + areaTerreno.retornaArea());

		sc.close();
	}

}
