package Exercicios;

import java.util.Scanner;

public class usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		 String agencia="";
		 int numConta=0;
		 float saldoAtual=0;
	     String operacao="";
	     
	     
	     Conta itau= new Conta("",0,0,"",0);
	     
	     System.out.println("Numero da Agencia");
	     agencia=entrada.next();
	     itau.setAgencia(agencia);
	     
	     System.out.println("Numero da Conta");
	     numConta=entrada.nextInt();
	     itau.setNumConta(numConta);
	     
	     System.out.println("Saldo atual");
	     saldoAtual=entrada.nextFloat();
	     itau.setSaldoAtual(saldoAtual);
	     
	     itau.escolhaOperacao();
	     itau.mostrarDados();

	}

}
