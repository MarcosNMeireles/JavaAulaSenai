import java.util.Scanner;

public class SalarioImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
				Scanner leia = new Scanner (System.in);
				
				double salarioB, salarioL, inss, imposto;
				
				System.out.println("Senhor usu�rio digite o salario do funcion�rio:");
				salarioB = leia.nextInt();
				
				
				salarioL = salarioB;
				
				inss = salarioB*0.05;
				
				salarioL = salarioB - inss;		
				imposto = salarioL*0.11;
				
				salarioL = salarioL - imposto;
								
				System.out.println("O salario bruto �: " 
									+ salarioB + ", \nO desconto do inss �: " 
									+ inss + "\nO desconto do Imposto de Renda �: " 
									+imposto +"\nO salario liquido �: " +salarioL);
			    
				leia.close();
			    
			  }
			
	}


