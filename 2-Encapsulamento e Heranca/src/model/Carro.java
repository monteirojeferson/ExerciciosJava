package model;

public class Carro extends Veiculo {
	
	private boolean passageiros;

	public boolean isPassageiros() {
		return passageiros;
	}

	public void setPassageiros(boolean passageiros) {
		this.passageiros = passageiros;
	}
	
	public void maisPassageiros() {
		if (this.passageiros==true) {
			System.out.println("Ele pode trasnportar mais de 1 passageiro");
			
		}
		else {
			System.out.println("Ele NÃO PODE trasnportar mais de 1 passageiro");
		}
	}
	
	

}
