package Exercicios3;

import java.util.Scanner;

public class Ex3_While {
	public static void main(System[]args)
	{
		int idade, soma1=0, soma2=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("Entre com a idade: ");
		idade=ler.nextInt();
		
		while(idade != -99) 
		{
			if(idade<=21)
			{
				soma1=soma1+1;
			}
			if(idade>=50)
			{
				soma2=soma2+1;
			}
		}
		System.out.printf("Rotal de pessoas com menos de 21: ",soma1);
		System.out.printf("Total de pessoas com mais de 50: ", soma2);	
	}
	
}
