package main;

import model.Aeronave;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aeronave gol = new Aeronave();
		
		gol.setAno(2017);
		gol.setCompanhiaAerea("Gol");
		gol.setVoando(false);
		
		gol.voar();
		gol.anoAviao();

	}

}
