package Exercicios4;

import java.util.Scanner;

public class Ex4_Matriz {
	public static void main(String[]args)
	{
		int matriz[][]=new int [3][3];
		int soma=0, soma_diagonal=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int linha = 0; linha < 3; linha ++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				matriz[linha][coluna]=entrada.nextInt();
				
				soma=soma+matriz[linha][coluna];
			}
		}
		for(int linha = 0; linha < 3; linha ++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				System.out.print(matriz[linha][coluna]);
			}
		}
		
		soma_diagonal = matriz[0][0]+matriz[1][1]+matriz[2][2];
		
		System.out.println("Resultada soma matriz: "+soma);
		System.out.println("Resultado soma dos valores em diagonal matriz: "+soma_diagonal);
	}

}
