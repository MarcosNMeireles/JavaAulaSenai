/*
Faça um programa para gerar 3 números aleatórios para 3 dados, 

mostre a soma dos números que saíram. 

Se 2 dados saírem com a mesma numeração
o jogador ganha 2 pontos de bônus, 

se os 3 dados saírem com a mesma numeração 
ele ganha 6 pontos de bônus e deve aparecer a mensagem "você é muito sortudo".
 
Se o total da soma dos dados mais o bônus for menor que 15 o jogador perde e apresenta a mensagem 
"Lamento, mas você perdeu" , 

se for maior ou igual a 15 ele ganha e apresenta a mensagem "
parabéns, você ganhou!" .
*/


package Principal;

import java.util.Random; //chamando a biblioteca "Random" para poder gerar números aleatórios 

public class Atividade {

	public static void main(String[] args) {
		        
		
		        Random random = new Random();// Gerando números aleatórios para os dados
		        int dado1 = random.nextInt(6) + 1; //Incrementando "+1" para os valores gerados sejam entre 1 a 6 
		        int dado2 = random.nextInt(6) + 1;
		        int dado3 = random.nextInt(6) + 1;

		       
		        int soma = dado1 + dado2 + dado3;  // Calculando a soma dos números dos dados

		        // Verificando se há bônus
		        int bonus = 0;
		        if (dado1 == dado2 && dado1 == dado3) {
		            bonus = 6;
		            System.out.println("Você é muito sortudo!");
		        } else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) {
		            bonus = 2;
		        }

		        // Verificando se o jogador ganhou ou perdeu
		        int total = soma + bonus;
		        if (total < 15) {
		            System.out.println("Lamento, mas você perdeu.");
		        } else {
		            System.out.println("Parabéns, você ganhou!");
		        }

		        // Imprimindo os números dos dados e a soma
		        System.out.println("Dados: " + dado1 + ", " + dado2 + ", " + dado3);
		        System.out.println("Soma: " + soma);

		        // Imprimindo o bônus e o total
		        System.out.println("Bônus: " + bonus);
		        System.out.println("Total: " + total); 
		/*
		
		// Usando operador condicional ternário == condição ? valor se verdadeiro : valor se falso
		// Usando o operador condicional ternário é necessário que haja as duas opções, mesmo que no caso de falso seja vazio ou não tenha valor
		
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1, dado2 = random.nextInt(6) + 1, dado3 = random.nextInt(6) + 1;
        int soma = dado1 + dado2 + dado3;
        
        // A variável "bonus" com base nas condições especificas
        // Se o valor for verdadeiro "bonus" recebe o valor 6
        // Se o dois dados tiverem o valor igual "bonus" recebe o valor 2, caso contrário 0
       
        int bonus = dado1 == dado2 && dado1 == dado3 ? 6 : (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) ? 2 : 0;
        int total = soma + bonus;
        String frase = bonus == 6 ? "Você é muito sortudo!": " ";  

        System.out.println(total < 15 ? "Lamento, mas você perdeu.\n" : "Parabéns, você ganhou! \n"  +frase);
        System.out.println("Dados: " + dado1 + ", " + dado2 + ", " + dado3); //a soma dos dados é atribuida diretamente no que será exibido ao usúario 
        System.out.println("Soma: " + soma);
        System.out.println("Bônus: " + bonus);
        System.out.println("Total: " + total);
		 
		 */

		
		    }
		
		

}


