package Atividades;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PecaUmNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		//int numero;
		
		//System.out.println("Senhor usu�rio digite um n�mero:");
		 //numero = leia.nextInt();
		 
		 //System.out.println("O n�mero digitado �: "+numero);
		
		String numero = JOptionPane.showInputDialog("Digite um n�mero:");
		JOptionPane.showMessageDialog(null,"Senhor usu�rio o n�mero digitado �: " +numero);
		 leia.close();
	}

}
