
package com.mycompany.lista8;
import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int A[][] = new int [5][5];
        int i, j;
        int x = 0;
        for (i = 0; i < 5; i ++){
            for (j = 0; i < 5; i ++){
        System.out.println ("Informe a linha: " + i +" º" + " e a coluna: " + j + " º");
        for (i = 0; i == x; i ++){
               for (j = 0; j == x; i ++){ 
                   A[i][j] = ler.nextInt ();
               } 
              } 
        if (x != A[i][j]){
            System.out.println ("Número não encontrado!");
        } else if (x == A[i][j]){
            System.out.println ("O valor fica na linha: " + i + " º" + " e na coluna" + j + " º");
        }
            }
        }
    }
}
