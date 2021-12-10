package Java_Lacos;

import java.util.*;

public class Lacos_Rep_DOWHILE_5 {

	public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float num,somaNum=0;
		
		System.out.println("\nEntre com um número:");
		num = leia.nextFloat();
		
		do
		{   somaNum+=num;
		    System.out.println("\nEntre com um número:");
			num=leia.nextFloat();
		
		}while (num!=0); 
		
		System.out.println("\nA soma dos números é:"+somaNum);
	}
}
