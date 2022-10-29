package e1;

import java.util.Scanner;

public class e2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1[] = new int [3];
		int n2[] = new int [3];
		int n3[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Escolha um numero " + (i + 1) + " do vetor 1");
			n1[i] = ler.nextInt ();
			System.out.println("Escolha um numero " + (i + 1) + " do vetor 2");
			n2[i] = ler.nextInt ();
			n3[i] = n1[i] + n2[i];
		}
		for (int i = 0; i < 3; i++) {
			if (n3[i] % 2 == 1) {
				System.out.println(n3[i]);
			}
		}
	}
}