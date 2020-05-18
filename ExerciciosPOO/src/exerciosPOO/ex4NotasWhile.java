package exerciosPOO;

import java.util.Scanner;

public class ex4NotasWhile {
	public static void main(String[] args) {
		/*4- Ler o nome de um aluno e as suas duas notas A e B, e após calcular a média
			ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a
			nota digitada é valida, caso seja inválida, repita a leitura. Repetir este
			procedimento para uma turma composta por cinco alunos, usando o comando
			While.*/
		
		int i=0;
		while (i<5) {
			
			Scanner entrada = new Scanner (System.in);
			System.out.println("Nome do aluno");
			String nome=entrada.next();
			
			System.out.println("Entre com o grau A");
			float nota1=entrada.nextFloat();
			
			if (nota1<0 || nota1>10) {
				while (nota1<0 || nota1>10) {
					System.out.println("Nota invalida");
					System.out.println("Entre com o grau A");
					nota1=entrada.nextFloat();
					
				}
				
			}
			System.out.println("Entre com o grau B");
			float nota2= entrada.nextFloat();
			if (nota2<0 || nota2>10) {
				while (nota2<0 || nota2>10) {
					System.out.println("Nota invalida");
					System.out.println("Entre com o grau A");
					nota2=entrada.nextFloat();
					
					
				}
				
			}
			float media = (nota1+nota2)/2;
			System.out.println("A média dx alunx " + nome + " é " + media);
			i++;
			
		}
		
		
		
			
			
		}
	}


