package exercios;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O
programa deve fazer as leituras dos valores enquanto o usuário estiver
fornecendo valores positivos. Ou seja, o programa deve parar quando o
usuário fornecer um valor negativo.*/
		
		Scanner entrada = new Scanner(System.in);
		float numPositivo=0,media=0,numAtual=0,numLidos=0;
		
		
		System.out.println("digite um numero");
		numPositivo= entrada.nextFloat();
		
		
		while (numPositivo>0) {
			
			/*Enquanto(while) numPositivo>0 a variavel numAtual vai somar ela mesma ao numPositivo, fazendo a soma ao final*/
			numAtual=numAtual+numPositivo;
			
			/*Pra saber quantos numeros foram lidos basta adc uma variavel de valor 0
			 * no while e toda vez que ele rodar vai ser adicionado 1*/
			numLidos=numLidos+1;
			
			/*Média é a soma de todos os numeros digitados dividos pela quantidade de numeros lidos,
			 *  o numAtual divido pela quantidade de numeros lidos*/
			media= numAtual / numLidos;
			
			
			/*Enquanto for positivo ele vai pedir uma entrada de numeros*/
			System.out.println("Numero Positivo,continue");
			numPositivo= entrada.nextInt();
		
			
			/*Caso o numero seja negativo ele mostra a varialvem numAtual com o resultado da soma*/
			if (numPositivo<0) {
				System.out.println("Numero " + numPositivo + " é negativo");
				System.out.println("A Soma dos números é "+ numAtual);
				System.out.println("Total de numeros lidos "+ numLidos);
				System.out.println("Média " + media);
				
				
			}
		}
	}

}
