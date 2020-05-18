package Exercicios;

import java.util.Scanner;

public class Conta {
	/*3-Criar uma classe Conta Corrente com os seguintes
atributos: n�mero da ag�ncia, n�mero da conta, saldo atual,
opera��o (dep�sito ou saque) e valor. Implementar os
seguintes m�todos:
M�todo para dep�sito.
M�todo para saque.
M�todo para imprimir o saldo atual.*/
	Scanner entrada= new Scanner(System.in);
	
	private String agencia;
	private int numConta;
	private float saldoAtual;
	private String operacao;
	private float valor;
	
	public Conta(String agencia, int numConta, float saldoAtual, String operacao, float valor) {
		this.agencia=agencia;
		this.numConta=numConta;
		this.saldoAtual=saldoAtual;
		this.operacao=operacao;
		this.valor=valor;
		
	}



	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(float saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	//Metodo depositar
	public void depositar() {
		float depositar= saldoAtual + valor;
		System.out.println("Voc� deposituou um valor, agora seu saldo � :" +depositar);
	}
	
	//Metodo sacar
	public void sacar () {
		
		float sacar = saldoAtual - valor;
		System.out.println("Voc� sacou um valor,agora seu saldo � : " + sacar );
		
	}
	
	public void escolhaOperacao() {
		System.out.println("Escolha sua opera��o");
		System.out.println("1-Sacar");
		System.out.println("2-Depositar");
		int operacao=entrada.nextInt();
		
		if (operacao==1) {
			System.out.println("Quanto deseja sacar? ");
			valor=entrada.nextInt();
			this.sacar();
			
		}
		else if (operacao==2) {
			System.out.println("Quanto deseja depositar? ");
			valor=entrada.nextInt();
			this.depositar();
		}
		else {
			System.out.println("");
			System.out.println("Escolha uma op��o dispon�vel");
			System.out.println("");
			this.escolhaOperacao();
			
		}
	}

	public void mostrarDados() {
		System.out.println("Ag�ncia: " + getAgencia());
		System.out.println("Conta: " + getNumConta());
		System.out.println("Saldo Anterior: R$ " + getSaldoAtual());
	}
}
