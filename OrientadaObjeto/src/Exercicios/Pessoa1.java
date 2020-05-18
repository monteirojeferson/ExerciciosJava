package Exercicios;

public class Pessoa1 {
	
	private String nome;
	private int idade;
	
	public Pessoa1(String nome, int idade) {
		
		this.nome=nome;
		this.idade=idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void nomeIdade() {
		int nascimento=idade+50;
		System.out.print(" Seu nome : " + getNome());
		System.out.print(" Sua idade daqui 50 anos é : " + nascimento);
	}

}
