package Atividades;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner (System.in);
		
		double numero[] = {1,2,3,4}, media = 0; 
		
		System.out.println("Senhor usu�rio digite a primeira nota: ");
		numero[0] = leia.nextDouble();
		media = media + numero[0];
		
		
		System.out.println("Senhor usu�rio digite a segunda nota: ");
		numero[1] = leia.nextDouble();
		media = media + numero[1];
		
		System.out.println("Senhor usu�rio digite a terceira nota: ");
		numero[2] = leia.nextDouble();
		media = media + numero[2];
		
		System.out.println("Senhor usu�rio digite a quarta nota: ");
		numero[3] = leia.nextDouble();
		media = media + numero[3];
				
		media = media/4;
		
		System.out.println("A media �: "+media);	
		
				
		
		
		
		 leia.close();
	}

}
