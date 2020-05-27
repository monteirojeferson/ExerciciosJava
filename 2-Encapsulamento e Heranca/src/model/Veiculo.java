package model;

public class Veiculo {

	/*Crie um sistema utilizando heran�a e encapsulado representando ve�culos.
* O sistema deve ter 4 camadas uma de ve�culo, outra de carro, outra de moto outra da
classe principal (main).
* Os m�todos dos ve�culos devem ser acessados na classe principal (Main) apenas por get
and seters.
* As classes dever�o possuir heran�as de seus atributos e m�todos.*/
	
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
			System.out.println("O ve�culo est� parado");
		}
	}
	public void mostrarDados() {
		System.out.println("Marca: " + getMarca());
		this.velocidade();
		
	}
}
