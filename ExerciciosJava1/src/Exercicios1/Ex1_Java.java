package Exercicios1;

import java.util.Scanner;

public class Ex1_Java {
	
	public static void main (String[] args) {
		float a, m, d, dias;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite sua idade somente em anos: ");
		a=in.nextFloat();
		System.out.print("Digite sua idade somente os meses: ");
		m=in.nextFloat();
		System.out.print("Digite sua idade somente os dias: ");
		d=in.nextFloat();
		dias=(a*12*30)+(m*30)+d;
		System.out.print("Sua idade total em dias é: "+dias);
		}
}