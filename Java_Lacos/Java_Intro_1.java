package Java_Lacos;

import java.util.Scanner;

public class Java_Intro_1  {

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);

			int anos,meses,dias,totalDias;

			System.out.println("\nEntre com quantos anos viveu: ");
			anos=leia.nextInt();
			System.out.println("\nEntre com a quantidade de meses: ");
			meses=leia.nextInt();
			System.out.println("\nEntre com a quantidade de dias: ");
			dias=leia.nextInt();

			totalDias= anos*365 + meses*30 + dias;

			System.out.println("\nVocê viveu: "+totalDias+" dia(s)");

		}


	}