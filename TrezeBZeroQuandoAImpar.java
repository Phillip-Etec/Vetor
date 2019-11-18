package complementarVetor;

public class TrezeBZeroQuandoAImpar {
	public static void main(String[] args) {
		int A[]= new int[] {0, 4, 3, 2, 1, 7, 9, 6, 5, 8 };
		int B[]= new int[10];
		int i=0, j=0;
		for (i=0;i<10;i++) {
			if (isDivisibleByTwo(A[i])) B[i]= 1;
			else B[i]=0;
		}
		//mostrarVetorUnidimensionalInt(A);
		//mostrarVetorUnidimensionalInt(B);
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
