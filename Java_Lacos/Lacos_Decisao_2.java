package Java_Lacos;

import java.util.*;

public class Lacos_Decisao_2 {

		
		public static void main(String args[])
		{
			Scanner leia = new Scanner(System.in);
			
			int N1,N2,N3;
			
			System.out.println("Escreva o primeiro n�mero: ");
			N1 = leia.nextInt();
			System.out.println("\nEscreva o segundo n�mero: ");
			N2 = leia.nextInt();
			System.out.println("Escreva o terceiro n�mero: ");
			N3= leia.nextInt();
			
			if (N1<=N2 && N1<=N3)
			{
				System.out.println("A ordem crescente dos n�meros � "+N1+","+N2+","+N3);
			}
			else if ((N1<=N2 && N3<=N2) && N1<=N3)
			{
				System.out.println("\nA ordem crescente dos n�meros � "+N1+","+N3+","+N2);
			}
			else if (N2<=N1 && N1<=N3)
			{
				System.out.println("\nA ordem crescente dos n�meros � "+N2+","+N1+","+N3);
			}
			else if (N2<=N1 && N2<=N3)
			{
				System.out.println("\nA ordem crescente dos n�meros � "+N2+","+N3+","+N1);
			}
			else if (N3<=N1 && N1<=N2)
			{
				System.out.println("\nA ordem crescente dos n�meros � "+N3+","+N1+","+N2);
			}
			
			else 
			{
				System.out.println("\nA ordem crescente dos n�meros � "+N3+","+N2+","+N1);
			}
			
		}

		
	}
