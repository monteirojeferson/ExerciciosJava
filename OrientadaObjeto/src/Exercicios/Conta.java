package Exercicios;

import java.util.Scanner;

public class Conta {
	/*3-Criar uma classe Conta Corrente com os seguintes
atributos: número da agência, número da conta, saldo atual,
operação (depósito ou saque) e valor. Implementar os
seguintes métodos:
Método para depósito.
Método para saque.
Método para imprimir o saldo atual.*/
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
		System.out.println("Você deposituou um valor, agora seu saldo é :" +depositar);
	}
	
	//Metodo sacar
	public void sacar () {
		
		float sacar = saldoAtual - valor;
		System.out.println("Você sacou um valor,agora seu saldo é : " + sacar );
		
	}
	
	public void escolhaOperacao() {
		System.out.println("Escolha sua operação");
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
			System.out.println("Escolha uma opção disponível");
			System.out.println("");
			this.escolhaOperacao();
			
		}
	}

	public void mostrarDados() {
		System.out.println("Agência: " + getAgencia());
		System.out.println("Conta: " + getNumConta());
		System.out.println("Saldo Anterior: R$ " + getSaldoAtual());
	}
}
