package Exercicios4;

import java.util.Scanner;

public class Ex1_Vetores {
	public static void main(String[]args) {
		int vet[]= new int[5];
		int maior, i;
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		for(i=0;i<5;i++) 
		{
			System.out.print("Digite um n?mero: ");
			vet[i]=entrada.nextInt();
		}
		
		maior=vet[0];
		
		for(i=0; i<5; i++) 
		{
			
			System.out.print(vet[i]);
		}
		
		for(i=0; i<5; i++)
		{
			if(maior<vet[i])
			{
				maior = vet[i];
			}
		}
		
		System.out.print("\n Maior: "+maior);
	}

}
