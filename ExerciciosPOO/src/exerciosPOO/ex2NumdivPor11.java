package exerciosPOO;

public class ex2NumdivPor11 {
	public static void main(String[] args) {
		/*
		 * Escreva um sistema estruturado que gere os n�meros de 1000 a 1999 e escreva
		 * somente os n�meros divis�veis por 11 ou cujo resto � 5.
		 */

		for (int i = 1000; i < 2000; i++) {
			if (i % 11 == 0) {
				System.out.println("s�o divisiveis por 11: " + i);
			} else if (i % 11 == 5) {
				System.out.println("O resto � 5: " + i);

			}

		}
	}

}
