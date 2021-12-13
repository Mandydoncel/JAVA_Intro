/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

package Java_Array;

import java.util.*;

public class Array_2 {

	public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] a = new int [6];
		int x, num, par=0, impar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEscreva um número: ");
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
			
		System.out.println("\nA soma dos números pares é de:"+par);	
		System.out.println("\nA soma dos números ímpares é de:"+impar);	
		
		System.out.println("\nOs números pares inseridos foram: ");
		
		for(x=0;x<6;x++)
		{
			if(a[x] % 2 ==0)
			{
				System.out.println(a[x]);			
			}
		}
		
		System.out.println("\nOs números ímpares inseridos foram: ");
		
		for(x=0;x<6;x++)
		{
			if(a[x] %2 != 0)
			{
				System.out.println(a[x]);			
			}
		}
		
				
		
	}
	
}
