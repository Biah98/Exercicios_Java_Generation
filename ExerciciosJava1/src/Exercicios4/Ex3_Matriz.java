package Exercicios4;

import java.util.Scanner;

public class Ex3_Matriz {
	public static void main(String[]args)
	{
		int mN1[][]=new int [4][6];
		int mN2[][]=new int [4][6];
		int mM1[][]=new int [4][6];
		int mM2[][]=new int [4][6];
		int l, c, soma;
		
		Scanner entrada = new Scanner(System.in);
		
		for(l=0; l<4; l++)
		{
			for(c=0; c<6; c++)
			{
				System.out.print("\n Digite um valor para a matriz n1: ");
				mN1[l][c]=entrada.nextInt();
			}
		}
		for(l=0; l<4; l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.print("\n Digite um valor para a matriz n2: ");
				mN2[l][c]=entrada.nextInt();
			}
		}
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				mM1[l][c]=mN1[l][c]+mN2[l][c];
			}
		}
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				mM2[l][c]=mN1[l][c]-mN2[l][c];
			}
		}
	}

}
