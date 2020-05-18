package Exercicios;

public class Pessoa {
	
	private String nome;
	private String email;
	private String telefone;

	
	
	
	/*public Pessoa(String nome,String email,String telefone,String nascimento) {
		this.nome=nome;
		this.email=email;
		this.telefone=telefone;
		this.nascimento=nascimento;
	}*/

	public Pessoa(String nome, String email, String telefone) {
		this.nome=nome;
		this.email=email;
		this.telefone=telefone;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public void mostrarNome() {
		System.out.println("O nome é " + getNome());
		
	}
	public void mostrarEmail() {
		System.out.println("Seu email " + getEmail());
		
	}
	public void mostrarTelefone() {
		System.out.println("O telefone: " + getTelefone());
	}
	

	
	public void mostrarNomeEmailTel() {
		System.out.print("Seu nome é " + getNome());
		System.out.print("Seu Email  " + getEmail());
		System.out.print("Seu Telefone " + getTelefone());
	}

}
