package Atividades;

import java.util.Scanner;

public class atv5  {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        System.out.println("Insira um numero: ");
	        int num = ler.nextInt();

	        int vetor[] = new int[num];

	        vetor[0] = 1;
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println();
	            int aux1 = 0;
	            int aux2;
	            for (int j = 0; j <= i; j++) {
	                aux2 = aux1 + vetor[j];
	                aux1 = vetor[j];
	                vetor[j] = aux2;
	                System.out.print(vetor[j] + " ");
	            }
	        }
	}
}






