package main;

import model.Carro;
import model.Moto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro();
		
		carro.setAcelerar(false);
		carro.setMarca("Gol");
		carro.setPassageiros(true);
		
		carro.mostrarDados();
		carro.maisPassageiros();
		
		System.out.println("\n");
		
		Moto moto = new Moto();
		moto.setAcelerar(true);
		moto.setMarca("Susuki");
		
		moto.mostrarDados();
		moto.usaCapacete();

	}

}
