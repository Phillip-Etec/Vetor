package complementarVetor;
import java.util.Random;
import java.util.Scanner;
public class OitoNaoSeiExplicar {
	public static void main(String[] args) {
		int[]A= new int[10];
		int[]B= new int[10];
		Random rand = new Random();Scanner in= new Scanner(System.in);
		int i=0, j=0;
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			A[i]=in.nextInt();
		}
		for (i=0;i<10;i++) {
			for (j=9;j>=i;j--) {
				B[i]= Somatoria(A[i]);
			}
		}
		mostrarVetorUnidimensionalInt(A);
		System.out.println("");
		mostrarVetorUnidimensionalInt(B);
	}
	public static int Somatoria(int n){
		int i=0;
		int m=i;
		while (i <= n) {
			m= m+i;
			i++;
		}
		return m;
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
		}System.out.print("------");System.out.println("> X");
		System.out.print("valor:"+espaco);
		for (i=0;i<(n.length-1);i++) {
			System.out.print(n[i]+espaco);
		}
		System.out.println(n[i]);
	}
}
