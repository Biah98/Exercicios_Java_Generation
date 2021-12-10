package Exercicios2;

import java.util.Scanner;

public class Ex3_Java {
	public static void main(String[]args)
	{
		int idade;
		
		Scanner ler = new Scanner(System.in);		
		System.out.println("Digite sua idade: ");
		idade=ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
		System.out.println("Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Adulto");
		}
		else
		{
			System.out.println("Inválido");
		}
	}
}