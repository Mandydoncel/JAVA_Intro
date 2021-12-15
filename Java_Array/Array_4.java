package Java_Array;

import java.util.Scanner;

public class Array_4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			float m1[][] = new float[2][2];
			float m2[][] = new float[2][2];
			float m3[][] = new float[2][2];
			int constante,l,c,op;
			
			Scanner leia = new Scanner(System.in);
			
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					System.out.println("\nEntre com o valor da matriz 1: ");
					m1[l][c] = leia.nextFloat();
					System.out.println("\nEntre com o valor da matriz 2: ");
					m2[l][c] = leia.nextFloat();
					
				}
			}
			
			do
			{
			System.out.println("\n\t\tMenu de oopções");
			System.out.println("\n(1) somar as duas matrizes ");
			System.out.println("\n(2) subtrair a primeira matriz da segunda");
			System.out.println("\n(3) adicionar uma constante as duas matrizes");
			System.out.println("\n(4) imprimir as matrizes");
			System.out.println("\n(0) Sair do sistema...");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						m3[l][c] = m1[l][c] + m2[l][c];
						System.out.println("\nSoma das matrizes: "+m3[l][c]);
					}
				}
				break;
			case 2:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						m3[l][c] = m2[l][c] - m1[l][c];
						System.out.println("\nSoma das matrizes: "+m3[l][c]);
					}
				}
				break;
			case 3:
				System.out.println("\nDigite o valor da constante: ");
				constante = leia.nextInt();
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						m1[l][c] += constante ;
						m2[l][c] += constante ;
						System.out.println("\nMatriz1: "+m1[l][c]);
						System.out.println("\nMatriz2: "+m2[l][c]);
					}
				}
				break;
			case 4:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						
						System.out.println("\nMatriz1: "+m1[l][c]);
						System.out.println("\nMatriz2: "+m2[l][c]);
					}
				}
				break;
				default:
					System.out.println("\nOpção inválida ou Sair do programa.");
			}
			}while(op!=0);
			
		}

	}

