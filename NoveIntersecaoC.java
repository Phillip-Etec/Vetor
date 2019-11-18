package complementarVetor;
import java.util.Random;
import java.util.ArrayList;
public class NoveIntersecaoC {
	public static void main(String[] args) {
		int A[]= new int[10];
		int B[]= new int[10];
		int i=0,j=0;
		ArrayList<Integer> C= new ArrayList<Integer>();
		Random rand= new Random();
		for (i=0;i<A.length;i++) A[i]=rand.nextInt(16);
		for (i=0;i<B.length;i++) B[i]=rand.nextInt(16);
		//mostrarVetorUnidimensionalInt(A);
		//mostrarVetorUnidimensionalInt(B);
		for (i=0;i<A.length;i++) {
			for (j=0;j<B.length;j++) {
				if (B[i]==A[j]) C.add(B[i]);
			}
		}
		System.out.print("C:	");
		for (i=0;i<C.size();i++) {
			 System.out.print(C.get(i)+"	");
		}
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
