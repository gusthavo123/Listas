package Atividades;
import java.util.Scanner;
public class Atividade1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int diagonal = 0;
		int [][] matriz = new int [3][3];
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz.length; j ++) {
				System.out.println("Informe o " + j +  " da linha " + i);
				matriz[i][j] = ler.nextInt ();
			}
		}
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz.length; j ++) {
				 diagonal += matriz[i][j];
			}
		}	
		System.out.println ("A soma da diagonal principal da matriz : " + diagonal);
	}
}
