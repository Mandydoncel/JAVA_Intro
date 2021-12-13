/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/


package Java_Array;

import java.util.*;

public class Array_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] a = new int [6];
		int soma;
		
		a[0]=1; a[1]=0; a[2]=5; a[3]=-2; a[4]=-5; a[5]=7;
		
		
			soma = a[0] + a[1] + a[5];
			System.out.printf("\nA soma dos vetores 0, 1 e 5 é de: %d",soma);
		
			a[3]=100;
		
			System.out.printf("\nO valor do vetor A1 é: %d",+a[0]);
			System.out.printf("\nO valor do vetor A2 é: %d",+a[1]);
			System.out.printf("\nO valor do vetor A3 é: %d",+a[2]);
			System.out.printf("\nO valor do vetor A4 é: %d",+a[3]);
			System.out.printf("\nO valor do vetor A5 é: %d",+a[4]);
			System.out.printf("\nO valor do vetor A6 é: %d",+a[5]);
		
		
	}
}
