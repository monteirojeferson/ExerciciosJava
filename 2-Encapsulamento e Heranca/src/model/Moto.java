package model;

public class Moto extends Veiculo {
	
	private boolean capacete;

	public boolean isCapacete() {
		return capacete;
	}

	public void setCapacete(boolean capacete) {
		this.capacete = capacete;
	}

	
	public void usaCapacete() {
		if (this.capacete==true) {
			System.out.println("Pode andar de moto");
		}
		else {
			System.out.println("Não pode andar de moto");
		}
	}
}
