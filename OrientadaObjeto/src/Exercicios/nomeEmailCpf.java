package Exercicios;

public class nomeEmailCpf {

	public static void main(String[] args) {
		
		/*1-Criar uma classe Pessoa com os seguintes atributos: nome,
           e-mai e telefone. Implementar o método para imprimir o
          cartão de visitas tal como o exemplo abaixo:
Maria dos Santos
maria@gmail.com
telefone: 2255-9999*/
		
		String nome="Maria dos Santos ";
		String email="maria@gmail.com ";
		String telefone="2255-9999 ";

		
		Pessoa maria = new Pessoa(nome,email,telefone);
		
		maria.mostrarNomeEmailTel();
			
		
	}

}
