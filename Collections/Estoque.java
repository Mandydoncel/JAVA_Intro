package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public static void main (String[] args)
	{
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do 
		{
			
			System.out.println("----------------------ESTOQUE------------------------");
			System.out.println("\n\t\t\tMENU");
			System.out.println("\n(1) Adicionar um produto no estoque.");
			System.out.println("\n(2) Remover um produto do estoque.");
			System.out.println("\n(3) Atualizar um produto no estoque.");
			System.out.println("\n(4) Mostrar todos os produtos do estoque.");
			System.out.println("\n(0) Sair do programa.");
			System.out.println("\nInforme a sua opção: ");
			System.out.println("------------------------------------------------------");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nAdicione o produto no estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nRemova o produto do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque.");
				}
			    break;
			    
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar no estoque: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto: "+verifica+" : ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe.");
				}
				System.out.println(estoque);
				break;
			
			case 4:
			    System.out.println("\nMostrar os produtos do estoque..");
			    System.out.println(estoque);
			    break;
			    default:
			    	System.out.println("\nPrograma finalizado.");
			
			}
			
		}while(op !=0);
		
	}

}