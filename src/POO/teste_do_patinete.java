package POO;

public class teste_do_patinete {
	public static void main (String args[])
	{
		String cor;
		patinete meuPatinete = new patinete ();
		
		meuPatinete.setCor("vermelho");
		
		cor=meuPatinete.getCor();
		
		System.out.println("A cordo patinete é: "+meuPatinete.getCor);
	}
}
