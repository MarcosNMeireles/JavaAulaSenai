package principal;

import java.util.Scanner;

import entities.Televisor;

public class Program {

	public static void main(String[] args) {
	/*
	 * 
	 * 
	 * // Criando um objeto da classe Televisor Televisor televisor = new
	 * Televisor();
	 * 
	 * // Ligando o televisor televisor.ligarTelevisor();
	 * 
	 * // Aumentando o volume em 1 televisor.aumentarVolume();
	 * 
	 * // Subindo o canal em 1 televisor.subirCanal();
	 * 
	 * televisor.desligarTelevisor();
	 * 
	 * // Exibindo o status atual do televisor televisor.mostrarStatus();
	 * 
	 * }
	 */

	// Classe Principal

	Televisor televisor = new Televisor();
    Scanner sc = new Scanner(System.in);
    boolean executando = true;

    while (executando) {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Aumentar volume");
        System.out.println("2 - Reduzir volume");
        System.out.println("3 - Subir canal");
        System.out.println("4 - Descer canal");
        System.out.println("5 - Ligar televisão");
        System.out.println("6 - Desligar televisão");
        System.out.println("7 - Mostrar status da televisão");
        System.out.println("8 - Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                televisor.aumentarVolume();
                break;
            case 2:
                televisor.reduzirVolume();
                break;
            case 3:
                televisor.subirCanal();
                break;
            case 4:
                televisor.descerCanal();
                break;
            case 5:
                televisor.ligarTelevisor();
                break;
            case 6:
                televisor.desligarTelevisor();
                break;
            case 7:
                televisor.mostrarStatus();
                break;
            case 8:
                executando = false;
                break;
            default:
	}
}
    sc.close();
}
}
