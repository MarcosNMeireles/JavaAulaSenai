import java.util.Scanner;

public class SalarioImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
				Scanner leia = new Scanner (System.in);
				
				double salarioB, salarioL, inss, imposto;
				
				System.out.println("Senhor usuário digite o salario do funcionário:");
				salarioB = leia.nextInt();
				
				
				salarioL = salarioB;
				
				inss = salarioB*0.05;
				
				salarioL = salarioB - inss;		
				imposto = salarioL*0.11;
				
				salarioL = salarioL - imposto;
								
				System.out.println("O salario bruto é: " 
									+ salarioB + ", \nO desconto do inss é: " 
									+ inss + "\nO desconto do Imposto de Renda é: " 
									+imposto +"\nO salario liquido é: " +salarioL);
			    
				leia.close();
			    
			  }
			
	}


