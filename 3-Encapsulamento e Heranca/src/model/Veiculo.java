package model;

public class Veiculo {
	
	/*Implemente o método acelerar e freio (reduzir) de forma dinâmica trabalhando com os de
velocidade das classes.
Desafio: implemente o método capotamento, que só deve acontecer se o veículo tentar
uma curva em uma velocidade de 70km por hora.*/

	private int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	public void acelerar() {
		
		if (this.velocidade<20) {
			System.out.println("Pode acelerar,você esta abaixo de 20 km ");
			System.out.println("Velocidade atual: " + this.velocidade);
			
		} else {
			System.out.println("Diminua a velocidade ,você esta acima de 20 km ");
			System.out.println("Velocidade atual: " + this.velocidade);
			
		}
	}
	
	public void cuidadoCurva() {
		if (this.velocidade>20) {
			System.out.println("Cuidado, existe uma cruva a frente.");
			System.out.println("Você esta acima do limite permitido, diminua para evitar acidentes");
			System.out.println("Velocidade " + this.velocidade);
			
		}
		else {
			System.out.println("Cuidado, existe uma cruva a frente.");
			System.out.println("Você esta  dentro do limite permitido, Parabens");
			System.out.println("Velocidade : " + this.velocidade);
			
		}
	}
	
}
