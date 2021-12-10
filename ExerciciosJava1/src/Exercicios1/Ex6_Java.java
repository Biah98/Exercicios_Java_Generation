package Exercicios1;

import java.util.Scanner;

public class Ex6_Java {
	public static void main (String[] args) {
		float x1, x2, y1, y2, d,pontosX, pontosY;
		Scanner in = new Scanner(System.in);
		System.out.print("Escreva o valor de X1: ");
		x1=in.nextFloat();
		System.out.print("Escreva o valor de X2: ");
		x2=in.nextFloat();
		System.out.print("Escreva o valor de Y1: ");
		y1=in.nextFloat();
		System.out.print("Escreva o valor de Y2: ");
		y2=in.nextFloat();
		
		pontosX= (float) Math.pow(x2-x1, 2.0);
		
		pontosY= (float) Math.pow(y2-y1, 2.0);
		
		d = (float) Math.sqrt(pontosX+pontosY);
		
		System.out.print(d);
		}
}