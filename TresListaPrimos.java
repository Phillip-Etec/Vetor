package complementarVetor;
import java.util.Random;
public class TresListaPrimos {
	public static void main(String[] args) {
		int[] rA= new int[10];
		int i=0, j=0;
		Random rand= new Random();
		for (i=0;i<10;i++) rA[i]=rand.nextInt(32);
		for (j=0;j<10;j++) {
			if (isPrime(rA[j])) System.out.println(rA[j]+" (número primo)");
			else System.out.println(rA[j]+" (não é primo)");
		}
	}
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
}