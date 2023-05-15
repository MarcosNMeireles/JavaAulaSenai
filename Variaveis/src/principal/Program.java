package principal;

import java.util.Scanner;

public class Program {

public static void main(String[] args) {
/***
* Variaveis são espaços alocados na memoria que salvam uma informação
* Tipos primitivos.
*
* int armazena números inteiros, 1, 2, 10, 150...
*
* double são números com casas decimais 10.5, 25.99, 110.11 ....
*
* char é um tipo que armazena um caracter 'literal' e a sua inicialização é feita com aspas simples.
*
* String é uma classe do jva utilizada pata armazenar cadeias de caracteres (frases por exemplo)sua inicialização
* é feita com "aspas duplas".
*  
*/



//Entrando com dados no console.
Scanner sc =  new Scanner(System.in);
System.out.println("Digite seu nome: ");
String nome = sc.nextLine();


String nomeFixo = "JL";
int numero = 10;
double preco = 20.5;
char sexo = 'M';

System.out.println(nome + " Nome digitado no console: ");
System.out.println(numero);
System.out.println(nomeFixo);
System.out.println(preco);
System.out.println(sexo);

//Alterando o valor da variavel preço
preco = 50.65;
System.out.println(preco);
System.out.println();
System.out.println();

//sem pular uma linha print
System.out.print(numero);
System.out.print(nome);
System.out.print(preco);
System.out.print(sexo);

//Pulando duas linhas com System.out.println
System.out.println();
System.out.println();

//Concatenando as variaveis
System.out.print(nome + " Sousa Marques" + " Sexo:" + sexo + " " + preco);
System.out.println();

System.out.print(nome + " Comprou uma camisa" + " no valor de: " + preco);

System.out.println();

//mudando os valores das variaveis nome e preço
nome = "Luizinho";
preco = 100.50;
System.out.println("Mudando o nome: " + nome + " " + preco + " Preço da camisa Mudado ");

System.out.println();

//Criando novas variaveis e somando
int n1 = 22;
int n2 = 15;
int soma = n1 + n2;
System.out.println("A soma das variaveis n1 + n2 :" + soma);



/***
* crie uma variavel com seu nome
* crie uma variavel com sua idade
* crie uma variavel com um saldo em conta
* mostre na tela a frase exemplo:
* "Luan Muruk tem 32 anos e possui 5 reais na conta
*/

System.out.println("Digite seu nome: ");
String nomeNovo = sc.nextLine();  

System.out.println("Digite sua idade:");
int idade = sc.nextInt();  

System.out.println("Digite seu saldo em conta");
double saldo = sc.nextDouble();  

System.out.println(nomeNovo + " tem " + idade + " anos  e possui "  + saldo + " na conta ");


sc.close();  

}

}
