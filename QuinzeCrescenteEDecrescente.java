package complementarVetor;
import java.util.Scanner;
public class QuinzeCrescenteEDecrescente {
	public static void main(String[] args) {
		int A[]= new int[10];
		int B[]= new int[10];
		int C[]= new int[10];
		int i=0, j=0, indice;
		Scanner in= new Scanner (System.in);
		for (i=0;i<10;i++) A[i]= in.nextInt();
		
		for (i=0;i<10;i++) {
			indice=0;
			for(j=0;j<10;j++) {
				if (A[i]>A[j]) indice++;
			}
			B[indice]= A[i];
		}
		for (i=0;i<10;i++) {
			indice=0;
			for(j=0;j<10;j++) {
				if (A[i]<A[j]) indice++;
			}
			C[indice]= A[i];
		}
		//mostrarVetorUnidimensionalInt(B);
		//mostrarVetorUnidimensionalInt(C);
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
