import java.util.Scanner;
public class e2 {
 public static void main (String [] args) {
	 Scanner ler = new Scanner (System.in);
	 int maior = 0;
	 int menor = 0;
	 int soma = 0;
	 int [] vetor = new int [5];
	 System.out.println ("Informe 5 numeros: ");
	 for (int i = 0; i < 5; i++) {
	 vetor [i] = ler.nextInt ();
	 }
	 if (vetor [i] > maior) {
	 } else  (vetor [i] < menor){
	 }
	 for (int i = 0 < i = 5; i ++) {
	 soma = vetor [i] + soma;
	 }
	 System.out.println("O menor numero e:" + maior);
	 System.out.println ("O maior numero e: " + menor);
	 System.out.println ("A soma e: " + soma)
  }
}