
package com.mycompany.lista8;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int A[][] = new int[4][4];
		int maiorValor = 0;
		int x=0;
		int y=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.println("Digite o número "+(j+1)+" da "+(i+1)+" linha:");
				A[i][j] = ler.nextInt();
				if (A[i][j] > maiorValor) {
					maiorValor = A[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println("O maior número se encontra em matriz["+x+"]["+y+"] e é igual a "+maiorValor);
	}
}
