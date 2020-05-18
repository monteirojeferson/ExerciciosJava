package Exercicios;


import java.util.Scanner;

public class usuarioEscolheCarro {

	public static void main(String[] args) {
		
		String cor="",marca="";
		
		//instanciar a classe Carro
		//criar o objeto com uma pessoa digitando
		
		Carro carrolAluno = new Carro("","");
		
		
		//recebendo dados do usuario
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a cor: ");
		cor = entrada.next();
		carrolAluno.setCor(cor);
		
		System.out.print("Informe a marca: ");
		marca= entrada.next();
		carrolAluno.setMarca(marca);
		
		//mostrando os resultados
		carrolAluno.mostraMarcaCor();
		
	}

}
