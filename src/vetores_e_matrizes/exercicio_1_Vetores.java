package vetores_e_matrizes;

import java.util.Scanner;

public class exercicio_1_Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Faça um programa que crie um vetor por leitura com 5 
 * valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. */
		
		
		int meuArray[]= new int[5];
		int soma=0, cont=0, maiorNumero=0;
		Scanner leia= new Scanner(System.in);
		
		//recebendo os numeros
		for(int indice=0;indice<5;indice++){
			System.out.print("\nDigite a pontuacao da sua atividade: ");
			meuArray[indice]=leia.nextInt();
		}
		//exibindo os numeros recebidos e testando qual o maior numero recebido
		System.out.println("\nAs pontuacoes informadas foram:");
		
		for(int indice=0;indice<5;indice++){
			System.out.print(meuArray[indice]+"\t");
			
			if (meuArray[indice] > maiorNumero)
			{
				maiorNumero= meuArray[indice];
			}
			
		}
		//exibindo a maior pontuação recebida
		System.out.print("\nA maior pontuacao eh: "+maiorNumero);
		
		
	}

}
