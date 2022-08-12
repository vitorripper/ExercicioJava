import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado a do triangulo: ");
		float a = sc.nextFloat();
		System.out.println("Digite o valor do lado b do triangulo: ");
		float b = sc.nextFloat();
		System.out.println("Digite o valor do lado c do triangulo: ");
		float c = sc.nextFloat();
		
		float ladoA = 0;
		float ladoB = 0;
		float ladoC = 0;
	
		
		
		
		if(a >= b && a >= c && b >= c ){
		    ladoA = a;
		    ladoB = b;
		    ladoC = c;
		    
		}
		if(b >= a && b >= c && a >= c){
		    ladoA = b;
		    ladoB = a;
		    ladoC = c;
		}
		if(c >= a && c >= b && b >= a){
		    ladoA = c;
		    ladoB = b;
		    ladoC = a;
		    
		}
		if(c >= a && c >= b && a >= b){
		    ladoA = c;
		    ladoB = a;
		    ladoC = b;
		}
		if(a >= b && a >= c && c >= b){
		    ladoA = a;
		    ladoB = c;
		    ladoC = b;
		}
		if(b >= a && b >= c && c >= a){
		    ladoA = b;
		    ladoB = c;
		    ladoC = a;
		} 
		
		if (ladoA >= ladoB + ladoC ){
		    System.out.println("NÃO FORMA TRIÂNGULO");
		}
		else{
		    
		 if (ladoA * ladoA == ladoB * ladoB + ladoC * ladoC){
		    System.out.println("Forma um triangulo Retângulo ");
		}
		 if( ladoA * ladoA > ladoB * ladoB + ladoC * ladoC){
		    System.out.println("Forma um triangulo Obstusângulo ");
		}
		 if(ladoA * ladoA < ladoB * ladoB + ladoC * ladoC){
		    System.out.println("Forma um triangulo Acutângulo ");
		}
	     if(ladoA == ladoB && ladoA == ladoC){
		    System.out.println("Forma um triangulo Equilátero ");
		}
		 if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC ){
		    System.out.println("Forma um triangulo Isósceles ");
		}
		 
		}
		
		
		
	}
}
