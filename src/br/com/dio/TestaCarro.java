package br.com.dio;

public class TestaCarro {
	
	public static void main(String[] args) {
		Carro testaCarro = new Carro();
		
		//Passando as informa��es para cada carro
		testaCarro.setAno(28);
		testaCarro.setModelo("HB20");
		testaCarro.setQtdPessoas(5);
		
		//Imprimindo as informa��es passadas
		
		System.out.println("Carro: "+testaCarro.getModelo());
		System.out.println("Ano de Fabrica��o: "+testaCarro.getAno());
		System.out.println("Lota��o: "+testaCarro.getQtdPessoas()+" pessoas");
		
		
	}

}