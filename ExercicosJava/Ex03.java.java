import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Insíra um número: ");
	    int n1 = teclado.nextInt();
	    n1*= n1;
	    // n1*n1 //
	    
	    System.out.print("Insira um número: ");
	    int n2 = teclado.nextInt();
	    n2*= n2;
	    // n2*n2 //
	    int resultado = n1 + n2;
	    
	    System.out.println("O resultado da soma dos quadrados é: " + resultado);
	}
}
