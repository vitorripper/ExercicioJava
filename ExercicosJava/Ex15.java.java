import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	
	    //Declarando variavel//
	    
	    System.out.print("Insira um número: ");
	    float a = sc.nextFloat();
	
	    System.out.print("Insira um número: ");
	    float b = sc.nextFloat();
	
	    System.out.print("Insira um número: ");
    	float c = sc.nextFloat();
	
	    float delta =
	    float x1 = (-b + delta) / 2*a;
	    float x2 = (-b - delta) / 2*a;
	
	    //Estrutura Condicional//
	    
	    if(a == 0) {
	    System.out.println("Impossivél calcular.");
	    }
	    
        else if(delta == 0){
	    System.out.println("O valor da raiz é igual: " + x1);
	    }
	
	
	    else{
	    System.out.println("O valor das raizes é igual: " + x1 + x2 );
        }
	
	
	}
}
