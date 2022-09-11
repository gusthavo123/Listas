package Atividades;
import java.util.Scanner;
public class Atv1 {
public static void main (String [] args) {
	Scanner ler = new Scanner (System.in);
	int vetA [] = new int [10];
	int vetB [] = new int [10];
	int vetC [] = new int [10];
	System.out.println("Informe os numeros do vetor A: ");
	for (int i = 0; i < 10; i++) {
	vetA [i] = ler.nextInt ();
	}
	System.out.println("Informe os numeros do vetor B: ");
	for (int i = 0; i < 10; i ++) {
	vetB [i] = ler.nextInt ();
	}
	for (int i = 0; i < 10; i++) {
	vetC [i] = vetA [i] - vetB [i] * vetA [i];
	System.out.println("O resultado do vetor C: " + vetC[i]);
	}
  }
}
