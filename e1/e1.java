package e1;
import java.util.Scanner;
public class e1 {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int n [] = new int [10];
	    for (int  i = 0; i < 10; i ++) {
	    System.out.println ("Escolha o numero " + i + " da sequencia");
	    n [i] = ler.nextInt ();
	    }
	    for (int i = 0; i < 10; i++) {
	    	System.out.println (i);
	    }
	}
}
