package Java_Lacos;

import java.util.*;

public class Lacos_Decisao_4 {


		public static void main(String[] args) {
			
			int num;
			double res;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
			
			if(num % 2 == 0)
			{
				res = Math.sqrt(num);
			}
			else
			{
				res = Math.pow(num, 2);
			}
			
			System.out.printf("\nResultado: %.2f",res);
			
		}
		
	}