package Exercicios6;

public class Pregui�a extends Animal {

public static void main(String[] args) {
		
		Pregui�a p = new Pregui�a();
		
		p.setNome("Bradypus variegatus");
		p.setIdade(50);
		p.setEspecie("Mam�fero");
		p.setSom(true);
		
		System.out.println("Nome: "+p.getNome());
		System.out.println("Vive at� "+p.getIdade()+" anos");
		System.out.println("Especie: "+p.getEspecie());
		
		p.setSom(true);
		p.emitesom();
		
		p.setLocomocao(false);
		p.correSobe();
	}
}
