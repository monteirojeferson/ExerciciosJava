package Exercicios;

import java.util.Scanner;

public class Empregados {
	/*Criar uma classe Empregados com os seguintes atributos:
id, nome, sobrenome e sal�rio atual.
Implementar o m�todo para exibir o nome completo e o
sal�rio;
implementar o m�todo para aumentar o sal�rio em 20% e
imprimir o nome e o sal�rio atual.
Implementar o m�todo para aumentar o sal�rio de acordo
com o �ndice digitado pelo usu�rio. Imprimir o nome, o
percentual de aumento e o sal�rio atual.*/
	
	private int id;
	private String nome;
	private String sobrenome;
	private float salarioAtual;
	private float valor;
	
	Scanner entrada = new Scanner(System.in);	
	public Empregados(int id,String nome,String sobrenome,float salarioAtual, float valor) {
		
		this.id=id;
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.salarioAtual=salarioAtual;
		this.valor=valor;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalarioAtual() {
		return salarioAtual;
	}

	public void setSalarioAtual(float salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void aumentarSalario() {
		System.out.println("Voc� deseja aumentar o sal�rio do seu funcion�rio? " );
		System.out.println("1) Sim ");
		System.out.println("2) N�o ");
		System.out.print("R: ");
		/*int escolha � uma variavel local, s� foi criada para poder usar o Scanner*/
		int escolha= entrada.nextInt();
		
		if (escolha==1) {
			
			System.out.println("Voc� deseja aumentar o sal�rio em 20 ou 30%?");
			System.out.println("1)20% ");
			System.out.println("2)30% ");
			System.out.println("R: ");
			escolha=entrada.nextInt();
			
		
		
		if (escolha ==1) {
			float valor = (salarioAtual*20)/100;
			System.out.println("Aumentar em 20% , no valor de " + valor);
			float salario = salarioAtual + valor;
			this.mostrarDados();
			System.out.print("Sal�rio atual: " + salario);
			
			
		}
		else if (escolha ==2) {
			float valor = (salarioAtual*30)/100;
			System.out.println("Aumentar em 30% , no valor de  " + valor);
			float salario = salarioAtual + valor;
			this.mostrarDados();
			System.out.print("Sal�rio atual: " + salario);
			
		}
		else {
			System.out.println("Esolha uma op��o dispon�vel");
			this.aumentarSalario();
		}
		}
		
		
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome completo: " + getNome() + " " + getSobrenome());
		System.out.println("Sal�rio Anterior: R$ " + getSalarioAtual());
		
	}
	

}
