package complementarVetor;
import java.util.Random;
import java.util.Scanner;
public class UmImparesEpares {
	public static void main(String[] args) {
		int[] rA= new int[20];
		int[][] B= new int[2][20];
		int i=0,j=0;
		Random rand= new Random();
		Scanner read= new Scanner(System.in);
		for (i=0;i<20;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			rA[i]= read.nextInt();
		}
		for (i=0;i<20;i++) {
			if (isDivisibleByTwo(rA[i])) {
				B[0][i]= rA[i];
				System.out.println(rA[i]+" é par");
				System.out.println("");
			} else {
				B[1][i]= rA[i];
				System.out.println(rA[i]+" é impar");
				System.out.println("");
			}
		}
		mostrarVetorBidimensionalInt(B);
	}
	public static boolean isDivisibleByTwo(int n) {  
	       if (n%2!=0) {  
	           return false;  
	       }  
	       else if (n%2==0) {
	    	   return true;
	       }
	       return true;
	   }
	public static void mostrarVetorBidimensionalInt(int n[][]) {
		String espaco= "	";
		char pipe='|', hifen='-', aspas='"', underline='_';
		int i=0, j=0;
		System.out.println(espaco+"y");
		System.out.println(espaco+"^");
		System.out.println(espaco+pipe);
		for (i=(n[0].length-1);i>=0;i--) {
			System.out.print("      "+i+" "+hifen);
			for(j=0;j<(n.length);j++) {
				System.out.print(n[j][i]+espaco);
			}
			System.out.println("");
			if (i!=0) System.out.println(espaco+pipe);
		}
		System.out.print(espaco+pipe);
		for (j=0;j<(n.length-1);j++) {
			for (i=0;i<7;i++) {
				System.out.print(underline);
			}
			System.out.print("|");
		}
		System.out.print("______-");System.out.println("> X");
		System.out.print(espaco);
		for (i=0;i<(n.length);i++) {
			System.out.print(i+espaco);
		}
	}
}
