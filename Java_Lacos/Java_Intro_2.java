package Java_Lacos;

import java.util.Scanner;

public class Java_Intro_2 {


		public static void main(String[]args) {
			Scanner leia = new Scanner (System.in);

			int anos,meses,tDias,dias;

			System.out.println("\nInforme o total de dias que voc� viveu:");
			tDias=leia.nextInt();

			anos = tDias/365;
			meses = (tDias%365) / 30;
			dias = meses*30;

			System.out.println("\nVoc� viveu "+anos+" ano(s),"+meses+" m�s(es) e "+dias+" dia(s)");


		}

	}