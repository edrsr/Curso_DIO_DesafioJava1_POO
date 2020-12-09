package br.com.dio;

public class TestaCarro {
	
	public static void main(String[] args) {
		Carro testaCarro = new Carro();
		
		//Passando as informações para cada carro
		testaCarro.setAno(28);
		testaCarro.setModelo("HB20");
		testaCarro.setQtdPessoas(5);
		
		//Imprimindo as informações passadas
		
		System.out.println("Carro: "+testaCarro.getModelo());
		System.out.println("Ano de Fabricação: "+testaCarro.getAno());
		System.out.println("Lotação: "+testaCarro.getQtdPessoas()+" pessoas");
		
		
	}

}