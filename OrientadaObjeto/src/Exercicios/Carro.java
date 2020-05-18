package Exercicios;


public class Carro {
	//atributos
	
	private String cor;
	private String marca;
	
	//Método construtor- tem sempre o mesmo nome da classe
	
	public Carro(String cor, String marca) {
		this.cor = cor;
		this.marca= marca;
	}
	
	//getter e setters

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//outros metodos da classe Carro
	
	public void mostraMarca() {
		System.out.println("A marca do carro é " + getMarca());
	}
	public void mostraMarcaCor() {
		System.out.println("Meu carro é " + getCor() + " e a marca é " + getMarca());
	}
		

}
