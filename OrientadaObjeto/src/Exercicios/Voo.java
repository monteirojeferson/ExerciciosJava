package Exercicios;

import java.util.Date;
import java.util.Scanner;

public class Voo {
	
	Scanner entrada = new Scanner (System.in);
	
	private int numeroVoo;
	private String data;
	private String horario;
	private int numeroDePassageiros;
	
	

	public  Voo(int numeroVoo,String data,String horario,int numeroDePassageiros) {
		this.numeroVoo=numeroVoo;
		this.data=data;
		this.horario=horario;
		this.numeroDePassageiros=numeroDePassageiros;
		
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public String getData() {
		return data;
	}

	public void setString(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumeroDePassageiros() {
		return numeroDePassageiros;
	}

	public void setNumeroDePassageiros(int numeroDePassageiros) {
		this.numeroDePassageiros = numeroDePassageiros;
	}
	public void data() {
		int data;
		System.out.println("Esolha a data do voo, pressione 1,2 ou 3 ");
		System.out.println("1) 25/06/2020");
		System.out.println("2) 26/06/2020");
		System.out.println("3) 27/06/2020");
		System.out.print("");
		System.out.print("R: ");
		
		
		data= entrada.nextInt();
		
		if (data==1) {
			System.out.println("a data escolhida foi 25/06/2020 ");
			
			
		}
		else if (data==2) {
			System.out.println("a data escolhida foi 26/06/2020 ");
		}
		else if (data==3) {
			System.out.println("a data escolhida foi 27/06/2020 ");
			
		}
		else {
			System.out.println("Escolha um opção disponível");
			this.data();
		}
	}
	public void horario() {
		
		int horario ;
		System.out.println("Esolha a período, pressione 1,2 ou 3 ");
		System.out.println("1) Manhã");
		System.out.println("2) Tarde");
		System.out.println("3) Noite");
		System.out.print("");
		System.out.print("R: ");
		
		horario = entrada.nextInt();
		
		if (horario==1) {
			System.out.println("Voo será no período da Manhã");
			
		}
		else if (horario==2) {
			System.out.println("Voo será no período da Tarde");
			
		}
		else if (horario==3) {
			System.out.println("Voo será no período da Noite");
			
		}
		else {
			System.out.println("Escolha uma opção disponível");
			this.horario();
		}
	}
	
	public void voo() {
		
		int voo ;
		
		System.out.println("Informe o número do voo ");
		System.out.println("1)Voo 234 TAM");
		System.out.println("2)Voo 357 AmericanAirlaines");
		System.out.println("3)Voo 247 TAM");
		System.out.print("");
		System.out.print("R: ");
		
		voo = entrada.nextInt();
		
		if (voo==1) {
			System.out.println("");
			
		}
		else if (voo==2) {
			System.out.println("Você viajará com a AmericanAirlaines no Voo 357");
		}
		else if (voo==3) {
			System.out.println("Você viajará com a TAM no Voo 247");
		}
		else {
			System.out.println("Escolha uma opção disponível");
			this.voo();
		}
	}
	public void DataHorarioVoo() {
		
		this.data();
		this.horario();
		this.voo();
		
		
	}
	
	public void mostrarDados(){
		System.out.println("Voo: " + getNumeroVoo());
		System.out.println("Data " + getData());
		System.out.println("Horario " + getHorario());
		System.out.println("Quantidade de passageiros " + getNumeroDePassageiros());
	}

}
