package Exercicios6;

public class Animal {
	// ATRIBUTOS
	private String nome;
	private int idade;
	private boolean som;
	private String especie;
	private boolean locomocao;
	
	// METODOS
	
	void correSobe() {
		if ( locomocao == true) {
			System.out.println("Este animal corre.");
		}
		else {
			System.out.println("Sobe em �rvores");
		}
	}
	
	void emitesom() {
		if (som == true) {
			System.out.println("Este animal emite som.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isLocomocao() {
		return locomocao;
	}

	public void setLocomocao(boolean locomocao) {
		this.locomocao = locomocao;
	}

	
}
