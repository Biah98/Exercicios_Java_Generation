package Exercicios4;

import java.util.Scanner;

public class Ex2_Vetores {
	
	public static void main(String[] args)
	{
		int vet[]= new int[10];
		int maior, i;
		float media, soma=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(i=0; i<10; i++)
		{
			System.out.println("Digite os valores: ");
			vet[i]=entrada.nextInt();
			soma+=vet[i];
		}
		
		for(i=0; i< 10; i++)
		{
			System.out.print(vet[i]);
		}
		
		maior = vet[0];
		
		for(i=0; i<5; i++);
		{
			if(maior<vet[i])
			{
				maior=vet[i];
			}
		}
	}

}
