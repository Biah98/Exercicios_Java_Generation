package Exercicios2;

import java.util.Scanner;

public class Ex2_Java {
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
		
		if(a>b && b>c)
		{
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
		}
		else if(a>c && c>b)
		{
			System.out.print(b);
			System.out.print(c);
			System.out.print(a);
		}
		else if(b>a && a>c)
		{
			System.out.print(c);
			System.out.print(a);
			System.out.print(b);
		}
		else if(c>a && a>b)
		{
			System.out.print(b);
			System.out.print(a);
			System.out.print(c);
		}
		else if(b>c && c>a)
		{
			System.out.print(a);
			System.out.print(c);
			System.out.print(b);
		}
		
		else
		{
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
		}
	}
}
