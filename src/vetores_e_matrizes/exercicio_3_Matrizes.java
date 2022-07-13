package vetores_e_matrizes;

public class exercicio_3_Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos 
de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
de mesma posição das matrizes N1 e N2.
*/ 
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
				
		N1[0][0] = 8;
		N1[0][1] = 7;
		N1[0][2] = 3;
		N1[0][3] = 5;
		N1[0][4] = 3;
		N1[0][5] = 9;
		
		N1[1][0] = 4;
		N1[1][1] = 8;
		N1[1][2] = 7;
		N1[1][3] = 10;
		N1[1][4] = 9;
		N1[1][5] = 15;
		
		N1[2][0] = 7;
		N1[2][1] = 10;
		N1[2][2] = 5;
		N1[2][3] = 7;
		N1[2][4] = 8;
		N1[2][5] = 9;
		
		N1[3][0] = 15;
		N1[3][1] = 20;
		N1[3][2] = 74;
		N1[3][3] = 9;
		N1[3][4] = 12;
		N1[3][5] = 10;
		
		N2[0][0] = 5;
		N2[0][1] = 4;
		N2[0][2] = 3;
		N2[0][3] = 2;
		N2[0][4] = 1;
		N2[0][5] = 7;
		
		N2[1][0] = 2;
		N2[1][1] = 5;
		N2[1][2] = 4;
		N2[1][3] = 9;
		N2[1][4] = 8;
		N2[1][5] = 7;
		
		N2[2][0] = 3;
		N2[2][1] = 2;
		N2[2][2] = 1;
		N2[2][3] = 4;
		N2[2][4] = 5;
		N2[2][5] = 6;
		
		N2[3][0] = 9;
		N2[3][1] = 8;
		N2[3][2] = 7;
		N2[3][3] = 6;
		N2[3][4] = 5;
		N2[3][5] = 4;
		
		for(int i=0; i<N1.length; i++) {
			for (int j=0; j<N1[i].length; j++) {
				System.out.print(N1[i][j]+" ");	
			}
			System.out.println();
			}
		
		System.out.println();
		
		for(int i=0; i<N2.length; i++) {
			for (int j=0; j<N2[i].length; j++) {
				System.out.print(N2[i][j]+" ");	
			}
			System.out.println();
			}
		
		System.out.println();
		
		
		for(int i=0; i<M1.length; i++) {
			for (int j=0; j<M1[i].length; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
				System.out.println("A soma das Matrizes N1 e N2 eh: " +M1[i][j]);}
			}
		
		System.out.println();
		
		for(int i=0; i<M1.length; i++) {
			for (int j=0; j<M1[i].length; j++) {
				M1[i][j] = N1[i][j] - N2[i][j];
				System.out.println("A subtracao das Matrizes N1 e N2 eh: " +M1[i][j]);}	
		}
	}

}
