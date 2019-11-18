package complementarVetor;

public class SeisExpoenteAoI {
	public static void main(String[] args) {
		int[] rA= new int[11];
		int i=0, j=0;
		for (i=0;i<11;i++) rA[i]= (int) Math.pow(2, i);
		for (j=0;j<11;j++) System.out.println("2 ^"+j+" = "+rA[j]);
	}
}
