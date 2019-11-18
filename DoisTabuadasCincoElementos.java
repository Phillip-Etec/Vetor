package complementarVetor;
import java.util.Random;
import java.util.Scanner;
public class DoisTabuadasCincoElementos {
	public static void main(String[] args) {
		int[] rA= new int[5];
		int i=0, j=0;
		Random rand= new Random();
		Scanner in= new Scanner(System.in);
		for (i=0;i<5;i++) rA[i]=rand.nextInt(64);
		for (i=0;i<5;i++) {
			for (j=0;j<10;j++) {
				System.out.println(rA[i]+" * "+(j+1)+" = "+(rA[i]*(j+1)));
			}
			System.out.println("");
		}
	}
}
