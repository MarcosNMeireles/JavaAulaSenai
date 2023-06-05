package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner (System.in);
		
        System.out.print("Digite o nome do funcion�rio: ");
        String nome = sc.nextLine();

        System.out.print("Digite o cargo do funcion�rio: ");
        String cargo = sc.nextLine();

        System.out.print("Digite o sal�rio do funcion�rio: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        funcionario.verificarSalarioECargo();

		sc.close();

	}

}
