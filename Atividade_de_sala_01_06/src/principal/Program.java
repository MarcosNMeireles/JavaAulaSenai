package principal;

import entities.Televisor;

public class Program {

public static void main(String[] args) {

// Criando um objeto da classe Televisor
        Televisor televisor = new Televisor();

        // Ligando o televisor
        televisor.ligarTelevisor();

        // Aumentando o volume em 1
        televisor.aumentarVolume();

        // Subindo o canal em 1
        televisor.subirCanal();

        // Exibindo o status atual do televisor
        televisor.mostrarStatus();

}

}
