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
	
	//M�todo Adi��o
	public void soma() {
		float resultado = numero1 + numero2;
		System.out.println("A soma � " + resultado);
	}
	
	//M�todo Subtra��o
	public void subtracao() {
		float resultado = numero1-numero2;
		System.out.println("A subtra��o � " + resultado);
	}
	//M�todo Multiplica��o
	public void multiplicacao() {
		float resultado = numero1*numero2;
		System.out.println("A multiplica��o � " + resultado);
	}
	//M�todo Divis�o
	public void divisao() {
		float resultado = numero1/numero2;
		if (numero1==0 ) {
			System.out.println("N�o � poss�vel dividir " + numero2 + " por 0");
			
		}
		else {
			System.out.println("N�o � poss�vel dividir " + numero1 + " por 0");
		}
	}
	
	//M�todo Elevar
	
	public void exponencial() {
		float resultado = (float) Math.pow(numero1, numero2);
		System.out.println("Exponencia��o: " + resultado);
	}
	
	public void escolhaOperacao() {
		
		System.out.println("1) Soma                2) Subtra��o ");
		System.out.println("3) Multiplica��o       4) Divis�o ");
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
			System.out.println("Escolha uma op��o v�lida");
			this.escolhaOperacao();
		}
		
		
		
	}
	

}
