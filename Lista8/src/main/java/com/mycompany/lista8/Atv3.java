
package com.mycompany.lista8;
import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float A[][] = new float [4][4];
        for (int i = 0; i < A.lenght; i++){
          for (int j = 0; j < A.lenght; j++){
             System.out.println("Informe a linha: " + i + " º" + " e a coluna: " + j + " º");
             A[i][j] = ler.nextFloat ();
          }
        }
        for (int i < 0; i < A.lenght; i++){
            for (int i < 0; i < A.lenght; i ++){
                if (j > 0){
                    A[i][j] *= A[i][j-1];
                    System.out.println ("J = " + (j - 1));
                }
            }
        }
        for (int i < 0; i < A.lenght; i ++){
            for (j < 0; j < A.lenght; j ++){
                if (j != 0){
                    A[j][i] = A[j-1][i] * A[j-1][i];
                }
            }
        }
        for (int i < 0; i < A.lenght; i ++){
            for (j < 0; j < A.lenght); j ++){
                System.out.println (A[i][j] + " ");
            }
            System.out.println ();
        }
    }
}
