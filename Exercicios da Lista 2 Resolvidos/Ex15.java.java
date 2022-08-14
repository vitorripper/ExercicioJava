import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	int N, X;
    	System.out.print("Digite um valor: ");
		X = input.nextInt();

		for (int i=0; i<X; i++) {
    		
    		if (X == 0) {
    			System.out.println("O valor de " + X + " é NULO.");
    		}
    		else {
    		if (X % 2 == 0) {
		    	System.out.println("O valor de " + X + " é PAR.");
    		}
    		else {
    			System.out.println("O valor de " + X + " é IMPAR.");
    		}
    		if (X > 0) {
    			System.out.println("O valor de " + X + " é POSITIVO.");
    		}
    		else {
    			System.out.println("O valor de " + X + " é NEGATIVO.");
    		}}
    	}
    }
}
		
 