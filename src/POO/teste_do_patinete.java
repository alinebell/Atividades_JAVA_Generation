package POO;

public class teste_do_patinete {
	public static void main (String[] args){
		//instanciar um objeto da classe patinete
		//string, string, boolean, double
		patinete pati = new patinete("azul", "adulto", true, 120);
		
		pati.imprimirInfo();
	}
}
