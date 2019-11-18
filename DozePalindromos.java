package complementarVetor;

import java.util.Scanner;
import java.util.Scanner;
public class DozePalindromos {
	public static void main(String[] args) {
		int C=0, i, j=0;
			int A[]= new int[] {0, 1, 7, 3, 4, 4, 3, 2, 1, 0};
			int B[]= new int[10];Scanner in= new Scanner(System.in);
			for (i=0;i<10;i++) {
				System.out.println("Digite o "+(i+1)+"° valor:");
				A[i]=in.nextInt();
			}
			int[][] xy= new int [2][2];
			xy[0][0]= 0;
			xy[1][0]= 9;
			for (i=0; i<10; i++) {
				if (A[xy[0][0]]==A[xy[1][0]]) {
					B[i]=A[xy[0][0]];
					j++;
					System.out.println(B[i]);
				}
				
				xy[0][0]++;
				xy[1][0]--;
			}
			if (j==0) System.out.println("esse vetor não é palíndromo");
			
			mostrarVetorUnidimensionalInt(B);
	}
	public static void mostrarVetorUnidimensionalInt(int n[]) {
		String espaco= "	";
		int i=0, j=0;
		System.out.print("posição:");
		for (i=0;i<(n.length-1);i++) {
			System.out.print(i+espaco);
		}
		System.out.println(n.length-1);
		System.out.print("--------"+"|");
		for (j=0;j<(n.length-1);j++) {
			for (i=0;i<7;i++) {
				System.out.print("-");
			}
			System.out.print("|");
		}System.out.print("------");System.out.println(">");
		System.out.print("valor:"+espaco);
		for (i=0;i<(n.length-1);i++) {
			System.out.print(n[i]+espaco);
		}
		System.out.println(n[i]);
		System.out.println("");
	}
}
