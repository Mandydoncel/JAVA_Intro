/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

package Java_Array;

import java.util.*;

public class Array_2 {

	public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] a = new int [6];
		int x, num, par=0, impar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEscreva um n�mero: ");
			num=leia.nextInt();
			
			a[x]=num;
			
			if(a[x] % 2 == 0)
			{
				par += a[x];
				
			}
			
			else
			{
				impar += a[x];
			}
			
		}
			
		System.out.println("\nA soma dos n�meros pares � de:"+par);	
		System.out.println("\nA soma dos n�meros �mpares � de:"+impar);	
		
		System.out.println("\nOs n�meros pares inseridos foram: ");
		
		for(x=0;x<6;x++)
		{
			if(a[x] % 2 ==0)
			{
				System.out.println(a[x]);			
			}
		}
		
		System.out.println("\nOs n�meros �mpares inseridos foram: ");
		
		for(x=0;x<6;x++)
		{
			if(a[x] %2 != 0)
			{
				System.out.println(a[x]);			
			}
		}
		
				
		
	}
	
}
