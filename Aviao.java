package br.com.generation.exercicios;

public class Aviao {
	
	//Atributos
	String modelo;
	String companhiaAerea;
	String tamanho;
	int ano;
	int capacidadePassageiros;
	int velocidade;
	
	//m�todos
	void decolar(int subir) {
		velocidade = velocidade + subir;
	}
	
	void pousar(int descer) {
		velocidade = velocidade - descer;
	}

}
