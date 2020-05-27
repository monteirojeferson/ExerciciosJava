package model;

public class Veiculo {

	/*Crie um sistema utilizando herança e encapsulado representando veículos.
* O sistema deve ter 4 camadas uma de veículo, outra de carro, outra de moto outra da
classe principal (main).
* Os métodos dos veículos devem ser acessados na classe principal (Main) apenas por get
and seters.
* As classes deverão possuir heranças de seus atributos e métodos.*/
	
	private boolean acelerar;
	private String marca;
	
	public boolean isAcelerar() {
		return acelerar;
	}
	public void setAcelerar(boolean acelerar) {
		this.acelerar = acelerar;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void velocidade() {
		if (this.acelerar==true) {
			
			System.out.println("O veiculo esta em movimento");
			
		}
		else {
			System.out.println("O veículo está parado");
		}
	}
	public void mostrarDados() {
		System.out.println("Marca: " + getMarca());
		this.velocidade();
		
	}
}
