package estruturas_repeticao;

import java.util.Scanner;

public class exercicio_WHILE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4- Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		 o número de pessoas calmas;
		 o número de mulheres nervosas;
		 o número de homens agressivos;
		 o número de outros calmos;
		 o número de pessoas nervosas com mais de 40 anos;
		 o número de pessoas calmas com menos de 18 anos.*/
				
				Scanner leia = new Scanner(System.in);
				
				int idade, sexo, temperamento, cont=0, calme=0, mulNervosa=0, homAgressivo=0,outroCalme=0, coroaNervoso=0, jovemCalmo=0;
				
				while(cont<=5)
				{
					System.out.println("\nEscreva sua idade: ");
					idade = leia.nextInt();
					System.out.println("\nDigite 1 para fem e 2 para masc ou 3 para outros: ");
					sexo=leia.nextInt();
					System.out.println("\nTemperamento\nDigite 1 para calmo, 2 para nervoso, 3 para agressivo: ");
					temperamento=leia.nextInt();
				
					if (temperamento ==1);
					{
						calme++;
					}
					if (sexo==1 && temperamento==2)
					{
						mulNervosa++;
					}
					if (sexo==2 && temperamento==3)
					{
						homAgressivo++;
					}
					if (sexo==3 && temperamento==1)
					{
						outroCalme++;
					}
					
					if (idade>40 && temperamento==2)
					{
						coroaNervoso++;
					}
					if (idade<18 && temperamento==1)
					{
						jovemCalmo++;
					}
					cont++;
					
				}
				System.out.println("Total mulNervosa"+mulNervosa);
				System.out.println("total homAgressivo"+ homAgressivo);
				System.out.println("Total outroCalme"+outroCalme);
				System.out.println("total coroaNervoso"+ coroaNervoso);
				System.out.println("total jovemCalmo"+ jovemCalmo);		
				
	}

}
