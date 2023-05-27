package principal;

//A classe Program � definida como p�blica e est� no pacote principal.
//Dentro do m�todo main, v�rias chamadas de m�todos e instru��es de sa�da est�o presentes
public class Program {

	public static void main(String[] args) {
		
		//chamando as fun��es que fora feitas logo ap�s
		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());
		System.out.println(mensagem4(4));
		System.out.println(exemploDoIgor(16.6));
	}
	//mensagem() � um m�todo est�tico que imprime "Primeiro void".
	static void mensagem () {
		System.out.println("Primeiro void");
	}
	//mensagem2(double n) � um m�todo est�tico que recebe um argumento n
	//do tipo double e imprime "O n�mero informado foi: " seguido pelo valor de n.
	static void mensagem2 (double n) {
		System.out.println("o numero informado foi: " +n);
	}
	
	//mensagem3() � um m�todo est�tico que retorna uma String 
	//contendo o texto "Aqui � minha fun��o de n�mero 3".
	static String mensagem3() {
		return "Aqui � minha fun��o de numero 3";
	}
	//mensagem4(int x) � um m�todo est�tico que recebe um argumento x 
	//do tipo int e retorna uma String contendo "N�mero informado: " seguido pelo valor de x.
	static String mensagem4(int x) {
		return "Numero informado: " +x;		
	}
	//exemploDoIgor(double y) � um m�todo est�tico que recebe um argumento y 
	//do tipo double e retorna uma convers�o de y para int.
	static int exemploDoIgor (double y) {
		return (int) y;
	}
}
