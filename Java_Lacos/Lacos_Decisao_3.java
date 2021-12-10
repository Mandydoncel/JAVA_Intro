package Java_Lacos;

import java.util.*;

public class Lacos_Decisao_3 {

			public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int idade;
			
			System.out.println("Qual a sua idade: ");
			idade = leia.nextInt();
			
					if (idade>=10 && idade<=14)
					{
						System.out.println("\nVocê tem "+idade+" anos e está na categoria INFANTIL.");
					}
					else if (idade>=15 && idade<=17)
					{
						System.out.println("\nVocê tem "+idade+" anos e está na categoria JUVENIL.");
					}
					else if (idade>=18 && idade<=25)
					{
						System.out.println("\nVocê tem "+idade+" anos e está na categoria ADULTO.");
					}
					else
					{
						System.out.println("\nIdade inválida!");
					}
		}

	}