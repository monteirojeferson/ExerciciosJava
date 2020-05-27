package Exercicios;

import java.util.Scanner;

public class utilizandoEmpregado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int id=0;
		String nome="";
		String sobrenome="";
	    float salarioAtual=0;
	    float valor=0;
	    
	    Empregados atendente = new Empregados(0,"","",0,0);
	    
	    System.out.print("Nome: ");
	    nome =entrada.next();
	    atendente.setNome(nome);
	    
	    System.out.print("Sobrenome: ");
	    sobrenome=entrada.next();
	    atendente.setSobrenome(sobrenome);
	    
	    System.out.print("Salário Atual: ");
	    salarioAtual=entrada.nextFloat();
	    atendente.setSalarioAtual(salarioAtual);
	    
	    atendente.aumentarSalario();
	    
	   

	}

}
