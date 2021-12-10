package Exercicios1;

import java.util.Scanner;

public class Ex8_Java {
	public static void main (String[] args) {
		int custoFabrica, custoDistribuidor, custoImposto, custoConsumidor;
		int perdistribuidor = 28;
		int perimposto = 45;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Valor de fábrica: ");
		custoFabrica=in.nextInt();
	
		
		custoDistribuidor = custoFabrica + (custoFabrica * perdistribuidor / 100);
		custoImposto = custoFabrica + (custoFabrica * perimposto / 100);
		custoConsumidor = custoFabrica + custoDistribuidor + custoImposto;
		
		System.out.println("O custo para o consumidor é: "+custoConsumidor);
		}
}