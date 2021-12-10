package Exercicios1;

import java.util.Scanner;

public class Ex2_Java {
	
	public static void main (String[] args) {
		float a, m, d, dias;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite sua idade total em dias: ");
		d=in.nextFloat();
		
		a = (d/365);
		m = (d % 365)/30;
		dias = (d % 365)%30;
		
		System.out.print("A idade em anos é " + a + " , meses "+ m + " e dias: " + dias);
		}
}