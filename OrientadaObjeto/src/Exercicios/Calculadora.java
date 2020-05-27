package Exercicios;

import java.util.Scanner;

public class Calculadora {
	
	private float numero1;
	private float numero2;
	private float resultado;
	
	Scanner entrada = new Scanner (System.in);
	
	public Calculadora(float numero1,float numero2,float resultado) {
		this.numero1=numero1;
		this.numero2=numero2;
		this.resultado=resultado;
		
	}

	public float getNumero1() {
		return numero1;
	}

	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}

	public float getNumero2() {
		return numero2;
	}

	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	//Método Adição
	public void soma() {
		float resultado = numero1 + numero2;
		System.out.println("A soma é " + resultado);
	}
	
	//Método Subtração
	public void subtracao() {
		float resultado = numero1-numero2;
		System.out.println("A subtração é " + resultado);
	}
	//Método Multiplicação
	public void multiplicacao() {
		float resultado = numero1*numero2;
		System.out.println("A multiplicação é " + resultado);
	}
	//Método Divisão
	public void divisao() {
		float resultado = numero1/numero2;
		if (numero1==0 ) {
			System.out.println("Não é possível dividir " + numero2 + " por 0");
			
		}
		else {
			System.out.println("Não é possível dividir " + numero1 + " por 0");
		}
	}
	
	//Método Elevar
	
	public void exponencial() {
		float resultado = (float) Math.pow(numero1, numero2);
		System.out.println("Exponenciação: " + resultado);
	}
	
	public void escolhaOperacao() {
		
		System.out.println("1) Soma                2) Subtração ");
		System.out.println("3) Multiplicação       4) Divisão ");
		System.out.println("5) Elevar");
		System.out.print("R: "); 
		int escolha = entrada.nextInt();
		
		if (escolha==1) {
			this.soma();
			
		}
		else if (escolha==2) {
			this.subtracao();
			
		}
		else if (escolha==3) {
			this.multiplicacao();
			
		}
		else if (escolha==4) {
			this.divisao();
			
		}
		else if (escolha==5) {
			this.exponencial();
			
		}
		else {
			System.out.println("Escolha uma opção válida");
			this.escolhaOperacao();
		}
		
		
		
	}
	

}
