package Exercicios;

import java.util.Scanner;

public class Janela {
	
	/*7-Criar uma classe Janela que possua os atributos largura,
altura, est� aberta (boolean). Implemente os m�todos: abrir,
fechar e est� aberta.*/

	private float largura;
	private float altura;
	private boolean aberta;
	
	Scanner entrada = new Scanner(System.in);
	
	public Janela(float largura, float altura, boolean aberta) {
		this.largura=largura;
		this.altura=altura;
		this.aberta=aberta;
		
		
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	public void abrir() {
		if (aberta==true) {
			
			System.out.println("Voc� abriu a janela");
			
		}
		
	}
	
	public void fechar () {
		if (aberta== false) {
			System.out.println("A janela esta fechada");
			
		}
	}
	
	public void janelaFechada() {
		
		
		
		if (aberta==true) {
			this.abrir();
			System.out.println("Caso queira fehcar a janela digite 1 ");
			System.out.print("R: ");
			int escolha = entrada.nextInt();
			
			if (escolha==1) {
				
				this.fechar();
				
			}
			
		}
	}
          public void janelaAberta() {
		
		
		
		if (aberta==false) {
			this.abrir();
			System.out.println("Caso queira Abrir a janela digite 1 ");
			System.out.print("R: ");
			int escolha = entrada.nextInt();
			
			if (escolha==1) {
				
				this.abrir();
				
			}
			
		}
	}
	
	public void janelaSemposicao() {
		
		System.out.println("1)Abrir");
		System.out.println("2)Fechar");
		int escolha= entrada.nextInt();
		
		if (escolha==1) {
			this.abrir();
			this.janelaFechada();
			
		}
		
		else if (escolha==2) {
			this.fechar();
			this.janelaAberta();
			
		}
		else {
			System.out.println("Escolha uma op��o dispon�vel");
			this.janelaSemposicao();
		}
	}
	
	
}
