package Exercicios;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		/*2-Criar uma classe Pessoa com os seguintes atributos: nome e
ano de nascimento. Implemente os seguintes métodos:
Método para calcular a idade da pessoa.
Método para calcular a idade da pessoa daqui 50 anos.*/
		
		String nome="";
		int idade=0;
		
		Pessoa1 pessoa1 = new Pessoa1("",0);
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.print("Digite seu nome ");
		nome = entrada.next();
		pessoa1.setNome(nome);
		
		System.out.print("Sua idade atual ");
		idade= entrada.nextInt();
		pessoa1.setIdade(idade);
		
		pessoa1.nomeIdade();
	}

}
