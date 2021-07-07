package br.com.generation.exercicios;

import br.com.generation.classes.Aluno;

public class TestaCliente {

	public static void main(String[] args) {
	
		//instância
		Cliente cliente1 = new Cliente();  
		Cliente cliente2 = new Cliente();   
		Cliente cliente3 = new Cliente();   
		
		
				
		cliente1.nomeCompleto = "Fernanda de Quadros";
		cliente1.localCompra = "Unidade Mauá";
		cliente1.estadoCivil = "solteira";
		cliente1.idade = 20;
		
		cliente2.nomeCompleto = "Alice Bezerra Santos";
		cliente2.localCompra = "Unidade SBC";
		cliente2.estadoCivil = "casada";
		cliente2.idade = 25;
		
		cliente3.nomeCompleto = "Tiago Souza Amaral";
		cliente3.localCompra = "Unidade Liberdade";
		cliente3.estadoCivil = "casado";
		cliente3.idade = 27;
		
		// chamar métodos e imprimir 
		
		cliente1.escolhaProduto();
		
		System.out.println(cliente1.nomeCompleto);
		System.out.println(cliente1.localCompra);
		System.out.println(cliente1.estadoCivil);
		System.out.println(cliente1.idade + " anos");
		System.out.println("\n");
		
		cliente2.pagamento();
		
		System.out.println(cliente2.nomeCompleto);
		System.out.println(cliente2.localCompra);
		System.out.println(cliente2.estadoCivil);
		System.out.println(cliente2.idade + " anos");
		System.out.println("\n");
		
		cliente3.separação();
		
		System.out.println(cliente3.nomeCompleto);
		System.out.println(cliente3.localCompra);
		System.out.println(cliente3.estadoCivil);
		System.out.println(cliente3.idade + " anos");
		System.out.println("\n");
		

	}

}
