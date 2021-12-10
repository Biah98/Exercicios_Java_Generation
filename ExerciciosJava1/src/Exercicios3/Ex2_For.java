package Exercicios3;

import java.util.Scanner;

public class Ex2_For {
	public static void main(System[]args)
	{
	int par=0, num, i;
	
	for(i=1;i<=10;i++)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Informe número: ");
		num=entrada.nextInt();
		
		if(num%2==0)
		{
			par=par+1;
		}
	}
	
	System.out.printf("Pares: %d\n",par);
	System.out.printf("Impares : %d\n", 10-par);
	}
}
