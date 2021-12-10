package Java_Lacos;
	
import java.util.*;
	public class Lacos_Rep_FOR_2 {
		
		public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			int x,num,par=0,impar=0;
			
			
			for (x=1;x<=10;x++)

			{
				System.out.println("\nDigite o "+x+"º número: ");
				num = leia.nextInt();
				
				if(num%2 == 0)
				{
					par++;
				}
				else
				{
					impar++;
				}
				
			}
			
			System.out.println("Foram digitados "+par+" números pares e "+impar+" números ímpares.");
		}
		
	
}
