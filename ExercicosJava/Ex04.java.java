import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Valor das variaveis//
	System.out.print("Insira um número: ");
	int n1 = sc.nextInt();
	
	System.out.print("Insira um número: ");
	int n2 = sc.nextInt();
	
	//Valor dos numeros consecutivos//
	int c1 = n1 + 1;
	int c2 = n2 + 1;
	
	System.out.println("O valor consecutivo dos número é: " + c1 + ", " + c2 );
	}
}
