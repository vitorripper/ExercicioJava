import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int maior = 0;

	    for(int i = 1; i < 11; i++ ){
	    System.out.printf("digite um numero (%d): ", i);
	    int n = sc.nextInt();
	       
	        
	        //Estrutura condicional//
	        if(n > maior){
	            maior = n;
	            
	        }
	        
	        else if(n == 0 ){
	            maior = n;
	            
	        }
	           
	           
	        
	    }
	    System.out.printf("O maior número é %d ", maior); 
		
	}
}
