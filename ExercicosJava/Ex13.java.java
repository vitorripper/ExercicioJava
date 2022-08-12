/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		
		System.out.print("Insira um número: ");
	    int n1 = sc.nextInt();
	
	    System.out.print("Insira um número: ");
	    int n2 = sc.nextInt();
	
	    System.out.print("Insira um número: ");
	    int n3 = sc.nextInt();
	    
//Processamento	    
	    
	    //Estruturas condicionais para maior
	    
	    if (n1 > maior) {
	        maior = n1;
	    }
	    
	    if (n2 > maior) {
	        maior = n2;
	    }
	    
	    if (n3 > maior) {
	        maior = n3;
	    }
	    System.out.println("O maior valor é: " + maior);
	}
}
