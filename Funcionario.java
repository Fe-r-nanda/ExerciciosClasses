package br.com.generation.exercicios;

public class Funcionario {

	String nome;
	String empresa;
	String cargo;
	String setor;
	int idade;
	int anosTrabalho;
	int entrada;
	int saida;

	
	void horasDiarias() {
		System.out.println((saida - entrada) + " Horas di�rias");
	}
	void horaAlmoco() {
	System.out.println("O funcion�rio tem direito a 1h de almo�o");
	}
}
