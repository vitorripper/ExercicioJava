import java.lang.Math;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Insíra um número: ");
	    int n1 = teclado.nextInt();
	    
	    System.out.print("Insira um número: ");
	    int n2 = teclado.nextInt();
	    
	    System.out.println("O resultado da potência é: " + Math.pow(n1, n2));
	
	}
}
