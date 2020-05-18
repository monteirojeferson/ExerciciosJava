package Exercicios;




public class utilizandoClasseCarro {

	public static void main(String[] args) {
		
		//variaveis que serão parametro do metodo construtor
		String cor="n sei";
		String marca="n sei tbm";
		
		
		//instanciando a classe carro/criando o objeto
		
		Carro corsa = new Carro(cor,marca);
		
		//executando metodo
		corsa.mostraMarcaCor();
		
		//trocando cor e marca
		corsa.setCor("vermelho");
		corsa.setMarca("corsa");
		corsa.mostraMarcaCor();
		
	}

}
