package br.com.generation.exercicios;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.ano = 2015;
		aviao1.capacidadePassageiros = 400;
		aviao1.companhiaAerea = "AZUL";
		aviao1.modelo = "AviatorXC1";
		aviao1.tamanho = "Médio Popular";
		aviao1.velocidade = 200;
		
		aviao2.ano = 2013;
		aviao2.capacidadePassageiros = 50;
		aviao2.companhiaAerea = "LATAM";
		aviao2.modelo = "08i03";
		aviao2.tamanho = "Jato Comercial";
		aviao2.velocidade = 900;
		
		
		aviao1.decolar(120);
		System.out.println("Informações sobre o avião: ");
		System.out.println("Ano de fabricação: " + aviao1.ano);
		System.out.println("Capacidade máxima: " + aviao1.capacidadePassageiros + " pessoas");
		System.out.println(aviao1.companhiaAerea);
		System.out.println("Modelo: " + aviao1.modelo);
		System.out.println(aviao1.tamanho);
		System.out.println("Velocidade ideal para decolar: " + aviao1.velocidade + " km/h");
		System.out.println("\n");
		
		aviao2.pousar(600);
		System.out.println("Informações sobre o avião: ");
		System.out.println("Ano de fabricação: " + aviao2.ano);
		System.out.println("Capacidade máxima: " + aviao2.capacidadePassageiros + " pessoas");
		System.out.println(aviao2.companhiaAerea);
		System.out.println("Modelo: " + aviao2.modelo);
		System.out.println(aviao2.tamanho);
		System.out.println("Velocidade ideal para pousar: " + aviao2.velocidade + " km/h");
		System.out.println("\n");
	}

}
