package Exercicios;

import java.util.Scanner;

public class utilizandoJanela {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float largura=0;
		float altura=0;
		boolean aberta= true;
		
		Janela janela = new Janela(largura, altura, aberta);
		
		System.out.println("Deseja abrir ou fechar a janela ??");
		System.out.print("1)Digite 1 para Sim e 2 para Não ");
		
		aberta = entrada.hasNext();
		janela.setAberta(aberta);
		
		janela.janelaSemposicao();
		
		
		
		
		

	}

}
