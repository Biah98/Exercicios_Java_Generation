package Exercicios2;

import java.util.Scanner;

public class Ex4_Java {
	public static void main(String[]args)
	{
		float numero, raiz, potenciacao;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		numero=ler.nextFloat();
		
		if(numero%2 == 0)
		{
			
			System.out.println("O n�mero " + numero+ " � par");
			System.out.println("A raiz de "+numero +" � "+ Math.sqrt(numero));
		}
		else
		{
			System.out.println("O n�mero " + numero+ " � impar");
			System.out.println("A pot�ncia��o de "+numero +" � "+ Math.pow(numero, 2.0));
		}
	}
}