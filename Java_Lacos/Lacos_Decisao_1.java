package Java_Lacos;

import java.util.Scanner;

public class Lacos_Decisao_1 { 
public static void main (String args[]) {
	 Scanner leia = new Scanner (System.in);
	 
	 int N1,N2,N3;
	 
	 System.out.println("Escreva o primeiro n�mero:");
	 N1 = leia.nextInt();
	 System.out.println("\nEscreva o segundo n�mero:");
	 N2 = leia.nextInt();
	 System.out.println("\nEscreva o terceiro n�mero:");
	 N3 = leia.nextInt();
	 
	if (N1>N2 && N1>N3)
	{
		System.out.println("\nO primeiro n�mero digitado "+N1+" � o maior.");
   }
	else if (N2>N1 && N2>N3)
	{
		System.out.println("\nO segundo n�mero digitado "+N2+" � o maior.");
	}
	else 
	{
		System.out.println("\nO terceiro n�mero digitado "+N3+" � o maior.");

	}	
	 

}
}
