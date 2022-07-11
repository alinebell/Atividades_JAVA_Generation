package estruturas_repeticao;

import java.util.Scanner;

public class exercicio_DO_WHILE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um programa que leia um número do teclado até que encontre um
		número igual a zero. No final, mostre a soma dos números
		digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		int n1,soma=0, cont=0;
		
		do	
		{
			System.out.println("\nDigite um numero: ");
			n1 = leia.nextInt();
			soma = soma +n1;
			cont++;
			
		}while (n1!=0);
		System.out.println("\nA soma dos numeros digitados e: "+soma);
	}

}
