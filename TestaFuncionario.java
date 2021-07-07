package br.com.generation.exercicios;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.anosTrabalho = 5;
		func1.cargo = "Assistente Comercial";
		func1.setor = "Vendas";
		func1.empresa = "TIFF Serviços Administrativos";
		func1.entrada = 7;
		func1.saida = 17;
		func1.idade = 28;
		func1.nome = "João da Silva";
		
		func2.anosTrabalho = 3;
		func2.cargo = "Desenvolvedor Web Pleno";
		func2.setor = "TI";
		func2.empresa = "B3";
		func2.entrada = 7;
		func2.saida = 17;
		func2.idade = 23;
		func2.nome = "Fernanda Correia";
		
		
		
		System.out.println("Informações sobre o funcionário: ");
		System.out.println(func1.nome);
		System.out.println(func1.idade + " anos");
		System.out.println(func1.cargo);
		System.out.println(func1.setor);
		System.out.println(func1.anosTrabalho + " Anos na empresa");
		System.out.println("Entrada: " + func1.entrada + "hrs");
		System.out.println("Saída: " + func1.saida + "hrs");
		func1.horasDiarias();
		func1.horaAlmoco();
		System.out.println("\n");
		
		System.out.println("Informações sobre o funcionário: ");
		System.out.println(func2.nome);
		System.out.println(func2.idade + " anos");
		System.out.println(func2.cargo);
		System.out.println(func2.setor);
		System.out.println(func2.anosTrabalho + " Anos na empresa");
		System.out.println("Entrada: " + func2.entrada + "hrs");
		System.out.println("Saída: " + func2.saida + "hrs");
		func2.horasDiarias();
		func2.horaAlmoco();
		

	}

}
