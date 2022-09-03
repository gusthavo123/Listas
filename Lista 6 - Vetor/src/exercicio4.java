import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int vet [] = new int [20];
		for (int i = 0; i < 20; i ++) {
			System.out.println ("Informe o " + (i + 1) + " numero");
			vet [i] = ler.nextInt ();
		}
		for (int i = 0; i < 20; i ++) {
			for (int j = 0; i < 20; i++) {
				if (vet[i] == vet [j]) {
				}
				System.out.println ("Os numeros sao: " + (vet [i] == vet [j] - 10000));
			}
		}
	}
}
