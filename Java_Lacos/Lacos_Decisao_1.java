package Java_Lacos;

import java.util.Scanner;

public class Lacos_Decisao_1 { 
public static void main (String args[]) {
	 Scanner leia = new Scanner (System.in);
	 
	 int N1,N2,N3;
	 
	 System.out.println("Escreva o primeiro número:");
	 N1 = leia.nextInt();
	 System.out.println("\nEscreva o segundo número:");
	 N2 = leia.nextInt();
	 System.out.println("\nEscreva o terceiro número:");
	 N3 = leia.nextInt();
	 
	if (N1>N2 && N1>N3)
	{
		System.out.println("\nO primeiro número digitado "+N1+" é o maior.");
   }
	else if (N2>N1 && N2>N3)
	{
		System.out.println("\nO segundo número digitado "+N2+" é o maior.");
	}
	else 
	{
		System.out.println("\nO terceiro número digitado "+N3+" é o maior.");

	}	
	 

}
}
