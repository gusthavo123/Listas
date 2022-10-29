package e1;
import java.util.Scanner;
public class e4 {
 public static void main (String [] args) {
	 Scanner ler = new Scanner (System.in);
	 int s = 0;
	 int[] n = new int [5];
	 for (int i = 0; i < 5; i++) {
	 System.out.println ("Escolha o numero " + (i + 1) + " da sequencia");
	 n[i] = ler.nextInt ();
	 }
	 for (int i = 0; i < 5; i++) {
		 s = n[i] / 5;
	 }
		 System.out.println ("A media e " + s);
 }
}
