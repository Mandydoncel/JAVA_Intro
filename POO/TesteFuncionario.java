package POO;

import java.util.*;

public class TesteFuncionario {

	public static void main(String [] srgs)
	{
		Scanner leia = new Scanner(System.in);
		Funcionario func1 = new Funcionario (null, null, null, null);
		String nome, sobrenome, matricula, setor;
		
		System.out.println("\nInforme o nome do Funcion�rio: ");
		nome = leia.next();
		func1.setNome(nome);
		System.out.println("\nInforme o sobrenome do Funcion�rio: ");
		sobrenome = leia.next();
		func1.setSobrenome(sobrenome);
		System.out.println("\nInforme a matr�cula do Funcion�rio: ");
		matricula = leia.next();
		func1.setMatricula(matricula);
		System.out.println("\nInforme o setor do Funcion�rio: ");
		setor = leia.next();
		func1.setSetor(setor);
		func1.imprimirInfo();
	}
	
}
