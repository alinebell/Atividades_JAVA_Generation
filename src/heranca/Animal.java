package heranca;

public class Animal {
	
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	public void Corre() {
		System.out.println("\nAnimal Corre");
	}
	public void emiteSom() {
		System.out.println("\nEmite Som");
	}
}
