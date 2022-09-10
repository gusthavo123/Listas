package Atividades;

public class atv2 {
public static void main (String [] args) {
	 int i,j;
	 int vet [] = new int [100];
	 int vet_aux [] = new int [100];
	    for (i = 0, j = 0; i < 100; i++) {
	    vet [i ]= i;
	    j = 0;
        }
	    for (i = 0; i < 100; i++) {
	    vet [i] = i;
	    }
	    if (vet [i] % 7 != 0) {
	    vet_aux [j] = vet [i];
	    j = j + 1;
	    }
	  System.out.println("Nao sao multiplos de sete:" + vet + vet_aux);
 }
}
