package principal;

public class Program {

	public static void main(String[] args) {
		
		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());
		System.out.println(mensagem4(4));
		System.out.println(exemploDoIgor(16.6));
	}
	
	static void mensagem () {
		System.out.println("Primeiro void");
	}
	static void mensagem2 (double n) {
		System.out.println("o numero informado foi: " +n);
	}
	static String mensagem3() {
		return "Aqui � minha fun��o de numero 3";
	}
	static String mensagem4(int x) {
		return "Numero informado: " +x;		
	}
	static int exemploDoIgor (double y) {
		return (int) y;
	}
}
