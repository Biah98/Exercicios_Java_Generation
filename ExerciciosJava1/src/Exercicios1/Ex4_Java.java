package Exercicios1;

import java.util.Scanner;

public class Ex4_Java {
	
	public static void main (String[] args) {
		float a, b, c, r, s, d;
		Scanner in = new Scanner(System.in);
		System.out.print("Escreva uma valor para A: ");
		a=in.nextFloat();
		System.out.print("Escreva uma valor para B: ");
		b=in.nextFloat();
		System.out.print("Escreva uma valor para C: ");
		c=in.nextFloat();
		
		r = (float) Math.pow(a+b, 2.0); 
		
		s= (float) Math.pow(b+c, 2.0);
		
		d= (r + s)/2;
		
		System.out.print(d);
		}
}