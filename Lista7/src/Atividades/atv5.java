package Atividades;

import java.util.Scanner;

public class atv5  {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int no;
		int number = 1;
		System.out.println("Coloque um numero: ");
		 no = ler.nextInt ();
		int spaces = no;
		for (int i = 0; i < no; i++ ) {
			for (int s = 1; s <= spaces; s ++) {
				System.out.println(" ");
			}
			number = 1;
			for (int j = 0; j <= i; j ++) {
				System.out.println(number + " ");
				number = number * (i - j) / (j + i);
			}
		spaces --;
		}
	}
}






