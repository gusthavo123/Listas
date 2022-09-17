
package com.mycompany.lista8;
import java.util.Scanner;
/**
 *
 * @author labinfo
 */
public class Atv2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int A [][] = new int [5] [5];
        for (int i = 0; i < 5; i ++){
          for (int j = 0; j < 5; j ++){
              System.out.println("Informe a linha: " + i + " º" + " e a coluna: " + j + " º");
              A [i][j] = ler.nextInt ();
              A[i][j] = i++;
              System.out.println(A[i][j]);
          }  
        }
    }
}
