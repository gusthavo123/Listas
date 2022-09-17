
package com.mycompany.lista8;
import java.util.Scanner;
/**
 *
 * @author labinfo
 */
public class Atv3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int A[][] = new int [4][4];
        int B[][] = new int [4][4];
        for (int i = 0; i < 4; i++){
          for (int j = 0; j < 4; j++){
             System.out.println("Informe a linha: " + i + " º" + " e a coluna: " + j + " º");
             A[i][j] = ler.nextInt ();
             System.out.println ("A linha é: " + A[i][j]);
             System.out.println ("A coluna é: " + A[i][j]);
             System.out.println ("A matrix é: " + A[i][j]);
          }
        }
    }
}
