package Exercicios;

import java.util.Date;
import java.util.Scanner;

public class vooCompleto {

	public static void main(String[] args) {
		int numeroVoo =0;
		String data ="";
		String horario = "";
		int numeroDePassageiros = 0;
		
		Voo vooCompleto = new Voo (0,"","",0) ;
			
	/*	Scanner entrada = new Scanner(System.in);
			
		
		System.out.println("Qual o n�mero do Voo? ");
		numeroVoo = entrada.nextInt();
		vooCompleto.setNumeroVoo(numeroVoo);
		
		System.out.println("Data do Voo");
		data = entrada.next();
		vooCompleto.setString(data);
		
		System.out.println("Digite o hor�rio do Voo ");
		horario= entrada.next();
		vooCompleto.setHorario(horario);
		
		System.out.println("Numero de passageiiros: ");
		numeroDePassageiros=entrada.nextInt();
		vooCompleto.setNumeroDePassageiros(numeroDePassageiros);*/
		
		
		vooCompleto.DataHorarioVoo();
	}

}
