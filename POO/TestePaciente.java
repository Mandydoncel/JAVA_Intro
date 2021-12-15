package POO;

import java.util.*;

public class TestePaciente {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		Paciente pac1 = new Paciente (null, null, null, null);
		String nome, sobrenome, genero, idade;
	
		
		
		System.out.println("\nInforme o nome do(a) paciente: ");
		nome = leia.next();
		pac1.setNome(nome);
		System.out.println("\nInforme o sobrenome do(a) paciente: ");
		sobrenome = leia.next();
	    pac1.setSobrenome(sobrenome);
		System.out.println("\nInforme o gênero: ");
		genero = leia.next();
		pac1.setGenero(genero);
		System.out.println("\nInforme a idade do(a) paciente: ");
		idade = leia.next();
		pac1.setIdade(idade);
		pac1.imprimirInfo();
	}
	    
}

