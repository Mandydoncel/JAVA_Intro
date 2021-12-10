package Java_Lacos;

import java.util.*;

public class Lacos_Rep_WHILE_3 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
		int idade,I21=0,I50=0;
		
		System.out.println("\nEscreva a sua idade: ");
	    idade=leia.nextInt();
	    
	    while (idade!=-99)
	    {
	    	System.out.println("\nEscreva a sua idade: ");
		    idade=leia.nextInt();
	    	if (idade<=21)
	    	{
	    		I21++;
	    	}
	    	else if (idade>=50)
	    	{
	    		I50++;
	    	}
	    	    	
	    }
	    
	    System.out.println("\nA soma de pessoas com menos de 21 anos é de "+I21);
    	System.out.println("\nA soma de pessoas com mais de 50 anos é de "+I50);
    			
	}
}
