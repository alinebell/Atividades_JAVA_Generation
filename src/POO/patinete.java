package POO;
/*5) Crie uma classe patinete e apresente os atributos e métodos referentes esta
classe, em seguida crie um objeto patinete, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

public class patinete {
	//declaração dos atributos da classe
	private String cor;
	private String modelo;
	private boolean freio;
	private double altura;
	
	//método construtor
	public patinete(String cor,String modelo,boolean freio,double altura)
	{
		this.cor=cor;
		this.modelo=modelo;
		this.freio=freio;
		this.altura=altura;
		
	}
	
	public void imprimirInfo() {
		System.out.println("\nO Patinete possui o modelo "
	+modelo+" na cor "+cor+" e tem a altura de "+altura+" centímetros.");
	}
}
