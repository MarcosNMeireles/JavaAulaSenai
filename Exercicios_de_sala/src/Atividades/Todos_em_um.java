package Atividades;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Todos_em_um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double numero = 0;
       // boolean valido = false;
        double numero2[] = {0,0,0};
        boolean valido1 = false;
        int cont = 1;
        double soma = 0;
        
       /* do  {
        while (!valido) 
        {
            String entrada = JOptionPane.showInputDialog("Digite um número:");
            try 
            {
                numero = Double.parseDouble(entrada);
                valido = true;
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número real.");
            }
        }
        
		JOptionPane.showMessageDialog(null,"Senhor usuário o número digitado é: " +numero);
		*/
		        
      	
        		
        		while (!valido1 && cont<3) 
        		{
        			String entrada = JOptionPane.showInputDialog("Digite um número " +cont);
        			try 
        			{
        				numero2 [cont] = Double.parseDouble(entrada);
        				valido1 = true;
        				soma = soma + numero2 [cont];
        				cont = cont+1;
        			} 
        			catch (NumberFormatException e) 
        			{
        				JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número real.");
        			}
        		}
        		
        		
		
        		
		 
		JOptionPane.showMessageDialog(null,"A soma é: "+soma);
		
	}
	
}
