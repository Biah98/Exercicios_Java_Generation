package Exercicios5;

public class Funcionario {

		
	String nome;
	String cargo;
	String data_adm;
	int matricula;
	boolean efetivo;
	
	public void ligado_a_empresa() {
		efetivo=true;
	}
	public void desligado_da_empresa(){	
		efetivo=false;
	}
	public void situacao() {
		if(efetivo==true) {
			System.out.println("Permenece desempenhando sua fun??o.");
		}
		else {
			System.out.println("Foi deligado da empresa.");
		}
	}
	public void status() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Matr?cula: "+this.matricula);
		System.out.println("Data da admiss?o: "+this.data_adm);
		System.out.println("Est? efetivado? "+this.efetivo);
		
	}
}
