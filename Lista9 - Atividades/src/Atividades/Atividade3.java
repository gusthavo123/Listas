
package Atividades;
import java.util.Scanner;
import java.util.Random;
public class Atividade3  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int bingo [][] = new int [5][5];
		int aleatorio;
		int nigual = 0;
        Random random = new Random();
		System.out.println("Sorteio da cartela de bingo!");
		for (int i = 0; i < 5; i ++) {
			for (int j = 0; j < 5; j ++) {
				int numero = random.nextInt(100);
				aleatorio = numero;
				bingo[i][j] = aleatorio;
				if (aleatorio == numero) {
			    aleatorio = nigual - 1000;
				System.out.println (bingo[i][j]);
				 }
				}
			}
		}
	}


