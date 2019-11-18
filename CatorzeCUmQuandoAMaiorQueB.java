package complementarVetor;

public class CatorzeCUmQuandoAMaiorQueB {
	public static void main(String[] args) {
		int A[]= new int[] {0, 12, 23, 13, 87, 34, 3, 6, 7, 0};
		int B[]= new int[] {18, 54, 23, 76, 12, 23, 25, 67, 12, 6};
		int C[]= new int[10];
		int i=0, j=0;
		for (i=0;i<10;i++) {
			if (A[i]>B[i]) C[i]=1;
			if (A[i]==B[i]) C[i]=0;
			if (A[i]<B[i]) C[i]=-1;
		}
		//mostrarVetorUnidimensionalInt(A);
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
