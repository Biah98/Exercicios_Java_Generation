package Exercicios6;

public class Cavalo extends Animal {

public static void main(String[] args) {
		
		Cavalo cvl = new Cavalo();
		
		cvl.setNome("Clydesdale");
		cvl.setIdade(16);
		cvl.setEspecie("Mam�fero");
		cvl.setSom(true);
		
		System.out.println("Nome: "+cvl.getNome());
		System.out.println("Vive at� "+cvl.getIdade()+" anos");
		System.out.println("Especie: "+cvl.getEspecie());
		
		cvl.setSom(true);
		cvl.emitesom();
		
		cvl.setLocomocao(true);
		cvl.correSobe();
	}
	
}
