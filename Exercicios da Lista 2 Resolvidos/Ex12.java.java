import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double n2 = 1; 
	    int negativo = 0;
	    double resul = 0;
	    
	System.out.print("Digite um número: ");
	int n = sc.nextInt();
	System.out.print("Quantas vezes você quer somar: ");
	int loop = sc.nextInt();
	
	    for(int i = 0; i < loop; i++){
	        resul+= n2/(n-negativo);
	        negativo++;
	        n2++;
	        
	    }
	    System.out.println(resul);
	}
}
