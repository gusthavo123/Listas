
package com.mycompany.lista8;
import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int A[][] = new int[5][5];
		int x;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.println("Digite o "+(j+1)+"º número da " + (i+1) + " linha: ");
				A[i][j] = ler.nextInt();
			}
		}
		 System.out.println("Digite o número que deseja procurar: ");
		 x = ler.nextInt();

		 for (int i = 0; i < A.length; i++) {
			 for (int j = 0; j < A.length; j++) {
				 if (A[i][j] == x) {
					 System.out.println("Número encontrado na posição:" ["+i+"]["+j+"] + "da Matriz");
					 break;
				 } else if (i == 4 && j == 4 && A[i][j] != x) {
					 System.out.println("Número não encontrado!");
				 }
			 }
         }
	}
}
