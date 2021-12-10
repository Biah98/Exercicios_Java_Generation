package Exercicios1;

import java.util.Scanner;

public class Ex7_Java {
	public static void main (String[] args) {
		float a, b, c, d, e, f, x, y;
		Scanner in = new Scanner(System.in);
		System.out.print("Ecreva o valor de a: ");
		a=in.nextFloat();
		System.out.print("Ecreva o valor de b: ");
		b=in.nextFloat();
		System.out.print("Ecreva o valor de c: ");
		c=in.nextFloat();
		System.out.print("Ecreva o valor de d: ");
		d=in.nextFloat();
		System.out.print("Ecreva o valor de e: ");
		e=in.nextFloat();
		System.out.print("Ecreva o valor de f: ");
		f=in.nextFloat();
		
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.print("Valor de x: "+x);
		System.out.print("Valor de y: "+y);
		}
}