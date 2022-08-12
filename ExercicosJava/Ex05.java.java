import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //valor do lado do quadrado//
		System.out.print("Insira o valor do número: ");
		int L = sc.nextInt();
		
		//Valor da area do quadrado//
		int area = L*L;
		
		System.out.println("O valor da área do quadrado é: " + area);
		
		
	}
}
