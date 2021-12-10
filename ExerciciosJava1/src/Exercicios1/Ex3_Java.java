package Exercicios1;

import java.util.Scanner;

public class Ex3_Java {
	
	public static void main (String[] args) {
		int seg, min, horas, total_seg;
		Scanner in = new Scanner(System.in);
		System.out.print("Escreva  tempo de duração de um evento em uma fábrica expressa em segundos: ");
		seg=in.nextInt();
		
		horas = (seg/3600);
		min = (seg % 3600)/60;
		total_seg = (seg % 3600)%60;
		
		System.out.print("Horas: " + horas + " ,minutos: "+ min + " e seg: " + total_seg);
		}
}