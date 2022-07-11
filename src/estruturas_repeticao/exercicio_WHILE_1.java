package estruturas_repeticao;

import java.util.Scanner;

public class exercicio_WHILE_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
				
				
				Scanner leia = new Scanner(System.in);
				int idade=0, m21=0, m50=0;
				
				
				
				while(idade!=-99)
				{
					System.out.println("\nQual a sua idade? ");
					idade = leia.nextInt();
					
					if(idade<21)
					{
						m21++;
					}
					if(idade>50)
					{
						m50++;
					}
				}
				System.out.println("\nMenor que 21: "+m21);
				System.out.println("\nMaior que 50: "+m50);
	}

}
