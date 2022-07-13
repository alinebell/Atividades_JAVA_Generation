package POO;
/*5) Crie uma classe patinete e apresente os atributos e métodos referentes esta
classe, em seguida crie um objeto patinete, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

public class patinete {
	String cor;
	String modelo;
	boolean freioLigado;
	double centimetros;
	
	void anda()
	{
		System.out.println("O patinete está andando...");
	}
	void regulaAltura(double quantidade)
	{
		double alturaNova = this.centimetros+quantidade;
		this.centimetros = alturaNova;
	}
	
	void freiar()
	{
		if(this.freioLigado == true)
			System.out.println("O patinete está com o freio ligado!");
		else
			System.out.println("O freio está desligado, atenção!");
	}

	
	
}
