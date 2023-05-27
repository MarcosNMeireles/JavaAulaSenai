package principal;

//A classe Program é definida como pública e está no pacote principal.
//Dentro do método main, várias chamadas de métodos e instruções de saída estão presentes
public class Program {

	public static void main(String[] args) {
		
		//chamando as funções que fora feitas logo após
		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());
		System.out.println(mensagem4(4));
		System.out.println(exemploDoIgor(16.6));
	}
	//mensagem() é um método estático que imprime "Primeiro void".
	static void mensagem () {
		System.out.println("Primeiro void");
	}
	//mensagem2(double n) é um método estático que recebe um argumento n
	//do tipo double e imprime "O número informado foi: " seguido pelo valor de n.
	static void mensagem2 (double n) {
		System.out.println("o numero informado foi: " +n);
	}
	
	//mensagem3() é um método estático que retorna uma String 
	//contendo o texto "Aqui é minha função de número 3".
	static String mensagem3() {
		return "Aqui é minha função de numero 3";
	}
	//mensagem4(int x) é um método estático que recebe um argumento x 
	//do tipo int e retorna uma String contendo "Número informado: " seguido pelo valor de x.
	static String mensagem4(int x) {
		return "Numero informado: " +x;		
	}
	//exemploDoIgor(double y) é um método estático que recebe um argumento y 
	//do tipo double e retorna uma conversão de y para int.
	static int exemploDoIgor (double y) {
		return (int) y;
	}
}
