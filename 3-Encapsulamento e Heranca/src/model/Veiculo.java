package model;

public class Veiculo {
	
	/*Implemente o m�todo acelerar e freio (reduzir) de forma din�mica trabalhando com os de
velocidade das classes.
Desafio: implemente o m�todo capotamento, que s� deve acontecer se o ve�culo tentar
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
			System.out.println("Pode acelerar,voc� esta abaixo de 20 km ");
			System.out.println("Velocidade atual: " + this.velocidade);
			
		} else {
			System.out.println("Diminua a velocidade ,voc� esta acima de 20 km ");
			System.out.println("Velocidade atual: " + this.velocidade);
			
		}
	}
	
	public void cuidadoCurva() {
		if (this.velocidade>20) {
			System.out.println("Cuidado, existe uma cruva a frente.");
			System.out.println("Voc� esta acima do limite permitido, diminua para evitar acidentes");
			System.out.println("Velocidade " + this.velocidade);
			
		}
		else {
			System.out.println("Cuidado, existe uma cruva a frente.");
			System.out.println("Voc� esta  dentro do limite permitido, Parabens");
			System.out.println("Velocidade : " + this.velocidade);
			
		}
	}
	
}
