
package com.mycompany.lista8;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author labinfo
 */
public class Atv4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n = 0;
        int m = 0;
        int A[][] = new int [4][4];
        for (int i =0; i < 4; i ++){
        for (int j = 0; j < 4; j ++){
        System.out.println("Informe a linha: " + i + " º" + " e a coluna: " + j + " º");
        A[i][j] = ler.nextInt();
        if (A[i][j] > n){
            A[i][j] = 0;
            System.out.println ("A localização do maior número da matrix é: " + n + Arrays.toString(A[i]) + Arrays.toString(A[j]));
           }
         }
        }
    }
}
