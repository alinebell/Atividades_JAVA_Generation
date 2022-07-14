package POO;

public class teste_funcionario {
	public static void main (String[] args){
		//instanciar um objeto da classe patinete
		//string, string, string, int, string
		funcionario pessoa = new funcionario("Maria Julia", "09599899890", "feminino", 2, "CLT");
		
		pessoa.imprimirInfo();
	}

}
