package Exercicios1;

import java.util.Scanner;

public class Ex5_Java {
	public static void main (String[] args) {
		float nota1, nota2, nota3, mediaP;
		Scanner in = new Scanner(System.in);
		System.out.print("Primeira nota: ");
		nota1=in.nextFloat();
		System.out.print("Segunda nota: ");
		nota2=in.nextFloat();
		System.out.print("Terceira nota: ");
		nota3=in.nextFloat();
		
		mediaP = (nota1*2 + nota2*3 + nota3*5)/(2+3+5);
		
		System.out.print(mediaP);
		}
}