package Exercicios2;

import java.util.Scanner;

public class Ex1_Java {
	public static void main(String[]args)
	{
		int a, b, c;
		
		Scanner ler = new Scanner(System.in);		
		System.out.println("Insira o valor do primeiro numero: ");
		a=ler.nextInt();
		System.out.println("Insira o valor do segundo numero: ");
		b=ler.nextInt();
		System.out.println("Insira o valor do terceiro numero: ");
		c=ler.nextInt();
		
		if(a>b && a>c)
		{
			System.out.print("O n�mero de maior valor �: " + a);
		}
		else if(b>c)
		{
			System.out.print("O n�mero de maior valor �: " + b);
		}
		else
		{
			System.out.print("O n�mero de maior valor �: " + c);
		}
	}
}