/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/


package Java_Array;

import java.util.*;

public class Array_3 {

	public static void main(String [] args) 
	{
	
		Scanner leia = new Scanner (System.in);
		
		float[][] x = new float[3][3];
		int linha, coluna, maiorde10 = 0;
				
		
		for (linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\tEscreva um número: ");
				x[linha][coluna] = leia.nextFloat();
				
				if (x[linha][coluna]>10)
				{
					maiorde10++;
				}
			
			}
			
		}
		
		System.out.printf("\nFoi inserido %d número(s) maior que 10 na matriz.",maiorde10);
	}
}
