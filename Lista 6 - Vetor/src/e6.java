import java.util.Scanner;
public class e6 {
 public static void main (String [] args) {
	 Scanner ler = new Scanner (System.in);
	 int m;
	 int vet [] = new int [10];
	 for (int i = 0; i < 10; i ++) {
		 System.out.println ("Informe os numeros:");
		 vet [i] = ler.nextInt ();
	 }
	 System.out.println ("Escolha um numeros para multiplicar (x)");
	 m = ler.nextInt ();
	 for (int i = 0; i < 10; i ++) {
		 if (vet [i] % m == 0) {
			System.out.println ("O numero " + vet[i] + " e multiplo de " + m); 
			m++;
		 }
		 System.out.println (m);
	 }
 }
}
