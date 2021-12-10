package Exercicios2;

import java.util.Scanner;

public class Ex4_Java {
	public static void main(String[]args)
	{
		float numero, raiz, potenciacao;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um número: ");
		numero=ler.nextFloat();
		
		if(numero%2 == 0)
		{
			
			System.out.println("O número " + numero+ " é par");
			System.out.println("A raiz de "+numero +" é "+ Math.sqrt(numero));
		}
		else
		{
			System.out.println("O número " + numero+ " é impar");
			System.out.println("A potênciação de "+numero +" é "+ Math.pow(numero, 2.0));
		}
	}
}