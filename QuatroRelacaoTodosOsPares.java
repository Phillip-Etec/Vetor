package complementarVetor;
import java.util.Random;
public class QuatroRelacaoTodosOsPares {
	public static void main(String[] args) {
		int[] rA= new int[10];
		int i=0, j=0;
		Random rand= new Random();
		for (i=0;i<10;i++) rA[i]=rand.nextInt(32);
		for (j=0;j<10;j++) {
			System.out.println(" Todos os Pares até "+rA[j]+":");
			for (i=0;i<=rA[j];i++) {
				if(isDivisibleByTwo(i)) System.out.println(i);
			}
			System.out.println("");
		}
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
}