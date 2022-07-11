package estruturas_repeticao;

import java.util.Scanner;

public class exercicio_DO_WHILE_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 6- Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
				Scanner leia = new Scanner(System.in);
				int n1,soma=0, cont=0;
				
				do	
				{
					System.out.println("\nDigite um numero: ");
					n1 = leia.nextInt();
						if(n1%3==0 && n1!=0)
						{
						soma = soma +n1;
						cont++;
						}
					
				}while (n1!=0);
				System.out.println("\nA media dos multiplos de 3 e: "+soma/cont);
	}

}
