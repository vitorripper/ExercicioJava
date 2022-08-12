import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Valor do variavel//
		System.out.print("Insira um número:");
		int numero = sc.nextInt();
		
		//Condição//
		if(numero < 0){
		    System.out.print("Esse número é negativo. ");
		}
		else {
		    System.out.println("Esse número não é negativo. ");
		}
		
	}
}
