import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();
		int n2 = 1;
		int soma = 0;
		
		    while(n2 <= n1 ){
		        soma = soma  + n2 ;
		        n2++;
		        
		    }
		    System.out.println("A soma dos números é: " + soma);
	}
}
