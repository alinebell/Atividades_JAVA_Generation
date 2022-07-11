package estruturas_condicionais;

import java.util.Scanner;

public class exercicio_1_cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
				int n1,n2,n3;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("\nEntre com o primeiro numero: ");
				n1 = leia.nextInt();
				System.out.println("\nEntre com o segundo numero: ");
				n2 = leia.nextInt();
				System.out.println("\nEntre com o terceiro numero: ");
				n3 = leia.nextInt();
				
				if(n1>n2 && n1>n3)
				{
				System.out.println("\nO primeiro numero e o maior");
				}
				else if(n2>n1 && n2>n3)
				{
				System.out.println("\nO segundo numero e o maior");	
				}
				else
				{
				System.out.println("\nO terceiro numero e o maior");
				}
	}

}
