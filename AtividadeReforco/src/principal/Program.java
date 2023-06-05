package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner (System.in);
		
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = sc.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        funcionario.verificarSalarioECargo();

		sc.close();

	}

}
