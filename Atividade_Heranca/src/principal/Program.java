package principal;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario("jose","financeiro",'m',50,5000);
		Funcionario gerente = new Gerente("janaina","gerente rh", 'F',20,7500);
		Funcionario secretaria = new Secretaria("Leone","Secretario Escolar",'M',23,1200);
		
		funcionario.bonificacao();
		gerente.bonificacao();
		secretaria.bonificacao();
		
		System.out.println(funcionario);
		
		System.out.println(gerente);
		
		System.out.println(secretaria);

	}

}
