package Java_Lacos;

import java.util.Scanner;

public class Java_Intro_5 {
	
		public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);

		{
		float N1,N2,N3,P1,P2,P3,media;
		P1=2;
		P2=3;
		P3=5;


		System.out.println("Escreva a nota 1: ");
		N1=leia.nextFloat();
		System.out.println("Escreva a nota 2: ");
		N2=leia.nextFloat();
		System.out.println("Escreva a nota 3: ");
		N3=leia.nextFloat();

		media = (N1*P1+N2*P2+N3*P3) / 10;

		System.out.printf("\nOlá, a sua nota média é: %.2f",media);
		

		}

		}

	}
