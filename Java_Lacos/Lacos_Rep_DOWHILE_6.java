package Java_Lacos;

import java.util.*;

public class Lacos_Rep_DOWHILE_6 {


		public static void main(String [] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int num,cont=0,somaNum=0;
			float mediaNum=0;
			
			System.out.println("\nEntre com um número inteiro:");
			num = leia.nextInt();
			
			do
			{ 
				if (num % 3 == 0)
				{
					cont++;
					somaNum+=num;
				}	
			    System.out.println("\nEntre com um número inteiro:");
				num=leia.nextInt();
		
					
			}while (num!=0); 
			
		
			mediaNum=(float)somaNum/cont;
	
			System.out.printf("\nForam informados %d número(s) múltiplo(s) de 3, e a média desses números é de %2f:",cont,mediaNum);
		}
	}


