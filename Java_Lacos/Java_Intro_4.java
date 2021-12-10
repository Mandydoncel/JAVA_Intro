package Java_Lacos;

import java.util.Scanner;

public class Java_Intro_4 {

			public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);

				float A,B,C,D,R,S;

				System.out.println("\nEscreva valor de A: ");
				A=leia.nextFloat();
				System.out.println("\nEscreva valor de B: ");
				B=leia.nextFloat();
				System.out.println("\nEscreva valor de C: ");
				C=leia.nextFloat();

				R=(float)Math.pow(A+B,2);
				S=(float)Math.pow(B+C,2);
				D=(R+S)/2;

				System.out.println("\nOlá, o resultado de D é:"+D);

			}
		}