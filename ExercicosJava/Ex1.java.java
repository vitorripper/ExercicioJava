import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    
		System.out.print("Insira um número: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Insira um número: ");
		int n2 = teclado.nextInt();
		
		int produto = n1 * n2;
		
		System.out.println("O resultado dos dois produtos: " + produto);
	}
}
