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
	    
//Processamento	    
	    
	    //Estruturas condicionais para maior
	    
	    if (n1 > maior) {
	        maior = n1;
	        menor = n1;
	    }
	    
	    if (n2 > maior) {
	        maior = n2;
	    }
	    
	    if (n2 < menor){
	        menor = n2;
	    }
	    
	
	    int valor = maior / menor;
	    System.out.println("O valor da divisão é: " + valor);
	}
}

