package Exercicios3;

import java.util.Scanner;

public class Ex6_DoWhile {
	public static void main (System[]args) 
	{
		int num, soma=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		num=entrada.nextInt();
		
		do 
		{
			System.out.print("Digite outro n�meor ou digite ZERO para ver a soma: ");
			num=entrada.nextInt();
			
			soma=soma+num;
		}while(num!=0);
		
		System.out.printf("Essa � a soma dos n�meros inseridos: ", soma);
	}
	

}
