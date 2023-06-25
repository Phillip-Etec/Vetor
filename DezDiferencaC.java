package complementarVetor;
import java.util.Random;
import java.util.ArrayList;

public class DezDiferencaC {
	public static void main(String[] args) {
		int A[]= new int[] {0, 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9};
		int B[]= new int[] {-1,-2,-3,-4,-5,6,7,8,9, 0};
		int C[][]= new int[2][10];
		int j=0, i=0, dif=0;
		for (i=0;i<10;i++) {
			dif=0;
			for (j=0;j<10;j++){
				if (A[i]!=B[j]) dif++;
				if (dif==10) C[0][i]=A[i];
			}
		}
		for (i=0;i<10;i++) {
			dif=0;
			for (j=0;j<10;j++){
				if (B[i]!=A[j]) dif++;
				if (dif==10) C[1][i]=B[i];
			}
		}
		//for (i=0;i<10;i++) System.out.println(C[0][i]);
		//for (i=0;i<10;i++) System.out.println(C[1][i]);
		mostrarVetorUnidimensionalInt(C[1]);
		mostrarVetorUnidimensionalInt(C[0]);
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
