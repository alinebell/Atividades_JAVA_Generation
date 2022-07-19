package POO;

public class funcionario {
	
	private String nome;
	private String cpf;
	private String sexo;
	private int filhos;
	private String regime;
	

	public funcionario(String nome, String cpf,String sexo,int filhos,String regime)
	{
		this.nome=nome;
		this.cpf=cpf;
		this.sexo=sexo;
		this.filhos=filhos;
		this.regime=regime;

	}
	
	public void imprimirInfo() {
		System.out.println("\nO funcionário "
	+nome+" de cpf "+cpf+", sexo "+sexo+", tem "+filhos+" filhos, e trabalha no regime "+regime+".");
	}
}
