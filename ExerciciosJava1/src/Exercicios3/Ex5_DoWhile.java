package Exercicios3;

import java.util.Scanner;

public class Ex5_DoWhile {
	public static void main (String[]args) 
	{
		int num, soma=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num=entrada.nextInt();
		
		do 
		{
			System.out.print("Digite outro número ou digite ZERO para ver a soma: ");
			num=entrada.nextInt();
			
			soma=soma+num;
		}while(num!=0);
		
		System.out.printf("Essa é a soma dos números inseridos: ", soma);
	}
	

}
