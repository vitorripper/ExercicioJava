import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float resultado;
		
		System.out.print("Insira um número: ");
		float A = sc.nextFloat();
		
		System.out.print("Insira um número: ");
		float B = sc.nextFloat();
		
		System.out.print("Insira um número: ");
		float C = sc.nextFloat();
		
		resultado = (A*C) /2;
		System.out.println("O valor da área do tríangulo retangulo: " + resultado);
		
		resultado = 3.14f * C;
		System.out.println("O valor da área do círculo: " + resultado);
		
		resultado = ((A+B)* C)/2;
		System.out.println("O valor da área do trapézio: " + resultado);
		
		resultado = B*B;
		System.out.println("O valor da área do quadrado: " + resultado);
		
		resultado = A*B;
		System.out.println("O valor da área do retangulo: " + resultado);
		
		resultado = (A*2) + (B*2);
		System.out.println("O valor do perímetro do retangulo: " + resultado);
		
		
		
	}
}
