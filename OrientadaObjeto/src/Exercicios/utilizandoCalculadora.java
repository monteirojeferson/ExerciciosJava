package Exercicios;

import java.util.Scanner;

public class utilizandoCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		float numero1=0;
		float numero2=0;
		float resultado=0;
		
		Calculadora calculadora = new Calculadora(numero1, numero2, resultado);
		
		System.out.print("Número: ");
		numero1 = entrada.nextFloat();
		calculadora.setNumero1(numero1);
		
		System.out.print("Número: ");
		numero2 = entrada.nextFloat();
		calculadora.setNumero2(numero2);
		
		calculadora.escolhaOperacao();
		

	}

}
