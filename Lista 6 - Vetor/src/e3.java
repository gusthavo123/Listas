import java.util.Scanner;
public class e3 {
public static void main (String [] args) {
	 Scanner ler = new Scanner (System.in);
	 int vet [] = new int [5];
	 for (int i = 0; i < 5; i++) {
	 System.out.println ("Informe o " + (i + 1) + " numero");
     vet [i] = ler.nextInt ();
      }
	  for (int i = 0; i < 5; i ++) {
		  for (int j = 0; j < 5; i ++) {
			  if (vet [j] == vet [i]) {
				  System.out.println ("Os numeros iguais sao: " + vet[j]);
			  }
		  }
	  }
	}
}
