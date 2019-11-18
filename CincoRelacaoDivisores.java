package complementarVetor;
import java.util.Random;
public class CincoRelacaoDivisores {
	public static void main(String[] args) {
		int[] rA= new int [10];
		int i=0, j=0;
		Random rand = new Random();
		for (i=0;i<10;i++) rA[i]= rand.nextInt(256);
		for (i=0;i<10;i++) {
			System.out.println("Todos os divisores de "+rA[i]);
			for (j=1;j<=rA[i];j++) {
				if (rA[i]%j==0) {
					System.out.println(j);
				}
			}
			System.out.println("");
		}
	}
	
}
