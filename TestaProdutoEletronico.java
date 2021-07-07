package br.com.generation.exercicios;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico prod1 = new ProdutoEletronico();
		ProdutoEletronico prod2 = new ProdutoEletronico();
		
		prod1.ano = 2020;
		prod1.marca = "Apple";
		prod1.memoria = 64;
		prod1.modelo = "celular";
		prod1.nome = "IPhone XF";
		prod1.versao = 15;
		
		prod2.ano = 2021;
		prod2.marca = "Samsung";
		prod2.memoria = 1;
		prod2.modelo = "relógio";
		prod2.nome = "Samsung Smart Watch";
		prod2.versao = 8;
		
		
		
		
		System.out.println(prod1.modelo + ", " + prod1.nome + ", " + prod1.marca + ", " + prod1.ano);
		prod1.ligacao();
		prod1.tiraFotos();
		prod1.temInternet();
		prod1.musica();
		System.out.println("\n");
		
	
		
		System.out.println(prod2.modelo + ", " + prod2.nome + ", " + prod2.marca + ", " + prod2.ano);
		prod1.temInternet();
		prod1.musica();
		

	}

}
