package exerciosPOO;

public class ex1SomaImpar {
	public static void main(String[] args) {
		/*
		 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
		 * m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
		 */

		int soma = 0;
		for (int i = 0; i < 501; i++) {

			if (i % 3 == 0 && i % 2 != 0) {
				System.out.println(i);
				soma = soma + i;

			}

		}
		System.out.println("Resultado da soma de todos os impares e que s�o multipos de 3 �: " + soma);
	}
}
