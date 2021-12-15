package POO;

import java.util.*;

public class ClienteTeste {
	
	public static void main(String [] args) 
	{
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente(null,null,null,null,null);
		String nome, sobrenome, genero, idade, telefone;

	System.out.println("\nEntre com o seu nome: ");
	nome = leia.next();
	cliente1.setNome(nome);
	System.out.println("\nEntre com o seu sobrenome: ");
	sobrenome = leia.next();
	cliente1.setSobrenome(sobrenome);
	System.out.println("\nInforme seu gênero: ");
	genero = leia.next();
	cliente1.setGenero(genero);
	System.out.println("\nInforme sua idade: ");
	idade = leia.next();
	cliente1.setIdade(idade);
	System.out.println("\nInforme o seu telefone com o código de área: ");
	telefone = leia.next();
	cliente1.setTelefone(telefone);	
	cliente1.imprimirInfo();
	
	}
	
}
