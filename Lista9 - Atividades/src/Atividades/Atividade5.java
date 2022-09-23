package Atividades;

import java.util.Scanner;

public class Atividade5  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nm;
		float nfinal;
		float mprova;
		float mtrab;
		float maiornota = 0;
		float ma;
		int matriz [][] = new int [5][4];
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz.length; j ++) {
				matriz[i][j] = ler.nextInt ();
				System.out.println("Informe os numeros de matriculas nessa primeira coluna: ");
				System.out.println("Informe as medias das provas aqui: ");
				System.out.println("Informe as medias dos trabalhos aqui: ");
				if (matriz[i][1] <= 3){
					System.out.println("Numero de matricula, media de prova e trabalho respectivamente: " + matriz[i][j]);
			}
				mprova = matriz[i][2] * matriz[i][2];
				mtrab = matriz [i][3] * matriz[i][3];
				nfinal = mprova / mtrab;
				if (nfinal > maiornota) {
					System.out.println("A maior nota foi de: " + maiornota);
				}
				ma = nfinal / matriz[i][j];
				System.out.println("A media aritimetica foi de: " + ma);
		}
	}
  }
}
