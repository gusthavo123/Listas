import java.util.Scanner;
public class e5 {
 public static void main (String [] args) {
	 Scanner ler = new Scanner (System.in);
	 int op;
	 float n;
	 float vet [] = new float [5];
	 for (float i = 0; i < 5; i ++) {
		 System.out.println ("0 - Sair" + "\n" + "1 - Ordem Direta" + "\n" + "2 - Ordem inversa");
		 op = ler.nextInt ();
	 }
	 switch (op) {
	 case 0:
		 System.out.println ("Finalizado!");
		 break;
	 case 1:
	     System.out.println ("Informe os numeros: ");
	     for (int i = 0; i < 5; i ++) {
	     vet [i] = ler.nextFloat ();
	     break;
	     } 
	 case 2: 
		  System.out.println ("Informe os numeros: ");
		  for (int i = 0; i < 5; i --) {
		  vet [i] = ler.nextFloat ();
		  break;
	   }
     default:
       System.out.println ("ERROR!");
       break;
	 }
  }
}
