package complementarVetor;
import java.util.Random;
public class SeteFatorDoVetor {
	public static void main(String[] args) {
		int[] rA= new int[15];
		long[] B= new long[15];
		int i=0, j=0;
		for (i=0;i<15;i++) rA[i]= i;
		for (j=0;j<15;j++) B[j]= Fator(rA[j]);
		for (i=0;i<15;i++) System.out.println((i)+"! = "+B[i]);
	}
	static int Fator (int f) {
		int n= f;
		f=1;
			while (n>1) {
				f= f*n;
				n--;
			}
		return f;
	}
}
