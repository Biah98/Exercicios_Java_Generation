package Exercicios6;

public class Cachorro extends Animal {
	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		
		c.setNome("Amarok");
		c.setIdade(8);
		c.setEspecie("Mam?fero");
		c.setSom(true);
		
		System.out.println("Nome: "+c.getNome());
		System.out.println("Idade: "+c.getIdade()+" anos");
		System.out.println("Especie: "+c.getEspecie());
		
		c.setSom(true);
		c.emitesom();
		
		c.setLocomocao(true);
		c.correSobe();
		
	}
}