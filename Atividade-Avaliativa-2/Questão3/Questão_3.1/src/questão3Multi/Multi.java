package questão3Multi;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------");
		System.out.println("-Digite o valor para servir de base para matriz-");
		System.out.println("--Ex: numeroXnumero sera a base de nossa matriz-- ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("--------------------------------------------------");
		System.out.println("-Na sequencia digite os numeros para nossa matriz-");
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-Diagonal principal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("-Numeros negativos : \n" + count);
		System.out.println("-Elementos da matriz:");
		for (int i = 0; i < mat.length; i++)  { 
		       for (int j = 0; j < mat[0].length; j++) {      
		           System.out.print(mat[i][j] + " ");
		           
		sc.close();
		    
		       } 
		}		
}
}

	


