package principal;

public class Matriz {

	public static void main(String[] args) {

		int[][] numeros = new int[3][3];

		int contador = 1;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + " \t");
				contador++;
			}
			System.out.println("\t");
		}

		System.out.println(" ");

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j] + "\t");
					if (j == numeros[i].length - 1) {
						System.out.print("\t");
					}
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}
}

