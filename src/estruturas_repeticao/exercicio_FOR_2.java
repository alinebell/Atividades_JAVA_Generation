package estruturas_repeticao;

import java.util.Scanner;

public class exercicio_FOR_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero, numeroPar=0, numeroImpar=0, x;
		
		for(x=1; x<=10; x++)
		{
		System.out.println("\nEscreva um numero: ");
		numero = leia.nextInt();
		
			if(numero%2==0)
			{
			numeroPar++;
			}
			
			else 
			{
			numeroImpar++;
			}
			
		}
		System.out.println("\nForam " +numeroPar+ " numeros pares e foram " +numeroImpar+ " numeros impares");
	}

}
