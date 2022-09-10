package Atividades;

import java.util.Scanner;

public class atv4  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetA [] = new int [10];
		int vetB [] = new int [10];
		int vetC [] = new int [10];
			System.out.println("Informe os elementos do vetor A: ");
			for (int i = 0; i < 10; i ++) {
			vetA [i] = ler.nextInt ();
		}
		System.out.println("Informe os elementos do vetor B: ");
		for (int i = 0; i < 10; i ++) {
			vetB [i] = ler.nextInt ();
		}
	     for (int i = 0; i < 10; i++) {
	    	vetC [i] = vetA [i] = vetB [i];
			if (vetC [i] == vetA [i] && vetB [i] != vetC [i]) {
			if (vetC [i] != vetA [i] && vetC [i] != vetA [i]) {	
				System.out.println("Uniao dos vetores: " + vetC[i]);
			      }
			 }
	        }
	}
}
	
