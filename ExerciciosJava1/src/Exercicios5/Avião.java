package Exercicios5;

public class Avi?o {
	
	//Atributos
	
	String cor;
	String tipo;
	String modelo;
	String asas;
	double tamano;
	double altMax;
	int velocidadeMax;
	boolean ligado;
	
	//Metodos
	
	public void ligar(){
		
		ligado = true;
		
	}
	
	public void desligado(){
		
		ligado=false;
		
	}
	
	public void voar(){
		
		if(ligado==true)
		{
			System.out.print("Pode iniciar o v?o!");
		}
		else 
		{
			System.out.print("Ligue o avi?o!");
		}
		
		
	}
	public void status() {
		System.out.println("O modelo do avi?o ?: "+this.modelo);
		System.out.println("A cor do avi?o ?: "+this.cor);
		System.out.println("O avi?o ?: "+this.tipo);
		System.out.println("Ele tem asa "+this.asas);
		System.out.println("Sua velocidade m?xima ?: "+this.velocidadeMax+"Km/h");
		System.out.println("Sua Altitude m?xima de voo ?: "+this.altMax+"ft");
	}
}
	