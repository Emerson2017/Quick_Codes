package faculdade;
import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner (System.in);
	public static void main (String args[]) {
		int vetor[] = new int[6], conta;
		 		
		
		for (int i = 0; i<=5; i++) {
			vetor[i] = leia.nextInt();
		}
		

		conta = 0;
		for (int i=0; i<=5; i++) {			
			if (vetor[i] > 0) {
				conta++;
			}	
		}
		
		System.out.println(conta + " valores positivos");
		
	}

}
