package atividade_sala120523;

import java.util.Scanner;

public class maior_de_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner leia = new Scanner(System.in);
        Double num1, num2, num3,maior;
        
        System.out.println("Digite o primeiro n�mero: ");
        num1 = leia.nextDouble();
        
        System.out.println("Digite o segundo n�mero: ");
        num2 = leia.nextDouble();
        
        System.out.println("Digite o terceiro n�mero: ");
        num3 = leia.nextDouble();
        
        if (num1>num2 && num1>num3)
		        	{
		        	maior = num1;
		        	}
		        	else if (num2>num1 && num2>num3)
		        	{
		        		maior = num2;
			        	}
			        	else
			        	{
				        	maior = num3;
				        	}
        System.out.println("O maior n�mero �: "+maior);

	leia.close();
}

}
