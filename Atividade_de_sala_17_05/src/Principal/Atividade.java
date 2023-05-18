/*
Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, 

mostre a soma dos n�meros que sa�ram. 

Se 2 dados sa�rem com a mesma numera��o
o jogador ganha 2 pontos de b�nus, 

se os 3 dados sa�rem com a mesma numera��o 
ele ganha 6 pontos de b�nus e deve aparecer a mensagem "voc� � muito sortudo".
 
Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde e apresenta a mensagem 
"Lamento, mas voc� perdeu" , 

se for maior ou igual a 15 ele ganha e apresenta a mensagem "
parab�ns, voc� ganhou!" .
*/


package Principal;

import java.util.Random; //chamando a biblioteca "Random" para poder gerar n�meros aleat�rios 

public class Atividade {

	public static void main(String[] args) {
		        
		
		        Random random = new Random();// Gerando n�meros aleat�rios para os dados
		        int dado1 = random.nextInt(6) + 1; //Incrementando "+1" para os valores gerados sejam entre 1 a 6 
		        int dado2 = random.nextInt(6) + 1;
		        int dado3 = random.nextInt(6) + 1;

		       
		        int soma = dado1 + dado2 + dado3;  // Calculando a soma dos n�meros dos dados

		        // Verificando se h� b�nus
		        int bonus = 0;
		        if (dado1 == dado2 && dado1 == dado3) {
		            bonus = 6;
		            System.out.println("Voc� � muito sortudo!");
		        } else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) {
		            bonus = 2;
		        }

		        // Verificando se o jogador ganhou ou perdeu
		        int total = soma + bonus;
		        if (total < 15) {
		            System.out.println("Lamento, mas voc� perdeu.");
		        } else {
		            System.out.println("Parab�ns, voc� ganhou!");
		        }

		        // Imprimindo os n�meros dos dados e a soma
		        System.out.println("Dados: " + dado1 + ", " + dado2 + ", " + dado3);
		        System.out.println("Soma: " + soma);

		        // Imprimindo o b�nus e o total
		        System.out.println("B�nus: " + bonus);
		        System.out.println("Total: " + total); 
		/*
		
		// Usando operador condicional tern�rio == condi��o ? valor se verdadeiro : valor se falso
		// Usando o operador condicional tern�rio � necess�rio que haja as duas op��es, mesmo que no caso de falso seja vazio ou n�o tenha valor
		
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1, dado2 = random.nextInt(6) + 1, dado3 = random.nextInt(6) + 1;
        int soma = dado1 + dado2 + dado3;
        
        // A vari�vel "bonus" com base nas condi��es especificas
        // Se o valor for verdadeiro "bonus" recebe o valor 6
        // Se o dois dados tiverem o valor igual "bonus" recebe o valor 2, caso contr�rio 0
       
        int bonus = dado1 == dado2 && dado1 == dado3 ? 6 : (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) ? 2 : 0;
        int total = soma + bonus;
        String frase = bonus == 6 ? "Voc� � muito sortudo!": " ";  

        System.out.println(total < 15 ? "Lamento, mas voc� perdeu.\n" : "Parab�ns, voc� ganhou! \n"  +frase);
        System.out.println("Dados: " + dado1 + ", " + dado2 + ", " + dado3); //a soma dos dados � atribuida diretamente no que ser� exibido ao us�ario 
        System.out.println("Soma: " + soma);
        System.out.println("B�nus: " + bonus);
        System.out.println("Total: " + total);
		 
		 */

		
		    }
		
		

}


