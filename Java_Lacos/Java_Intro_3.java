package Java_Lacos;

import java.util.Scanner;

public class Java_Intro_3 {
	
		public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);

	int totalS,hora,min,seg;

	System.out.println("Informe quantos segundos a festa teve de duração: ");
	totalS = leia.nextInt();

	hora = totalS/3600;
	min = (totalS-(hora*3600)) / 60;
	seg = (totalS % 60);

	System.out.println("\nO evento teve duração de "+hora+" hora(s) "+min+" minutos(s) e "+seg+" segundo(s)");

	          }

	}