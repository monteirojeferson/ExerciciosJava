package model;

public class Aeronave {
	
	private String companhiaAerea;
	private int ano;
	private boolean voando;
	
	
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}
	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isVoando() {
		return voando;
	}
	public void setVoando(boolean voando) {
		this.voando = voando;
	}
	
	public void voar() {
		
		if (this.voando==true) {
			System.out.println("A Aeronave "+ getCompanhiaAerea()+"esta voando");
			
		}
		else {
			System.out.println("A Aeronave "+ getCompanhiaAerea()+" está parada");
		}
	}
	
	public void anoAviao() {
		if (this.ano<2015) {
			System.out.println("É um modelo novo");
			
		}
		else {
			System.out.println("É um modelo antigo");
		}
	}

}
