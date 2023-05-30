/*Faça um programa com uma função que recebe dois parâmetros 
(valorDoProduto, lucroProduto) os produtos a serem vendidos
recebem o preço de custo 
e retorna o valor com uma porcentagem aplicada de lucro, 
por exemplo: 
se um produto custa 10,00 e é aplicada uma taxa de 10 % de lucro,
o produto será vendido por 11,00;*/

package Program;

import java.util.Scanner;

public class ValorProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numero = new double[2];

		System.out.println("Entre com o valor do produto: ");
		numero[0] = sc.nextDouble();
		System.out.println("Qual o percentual de lucro: ");
		numero[1] = sc.nextDouble();

		produto(numero[0], numero[1]);
		sc.close();
	}

	public static void produto(double valorDoProduto, double lucroProduto) {
		double resultado = valorDoProduto *(1+(lucroProduto/100));
		//O String.format permite escolher a quantidade de casas decimais a serem apresentadas
		System.out.println("O valor com o lucro é: " + String.format("%.2f", resultado));
	}

}
		
		
