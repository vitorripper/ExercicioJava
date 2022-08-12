import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Insira um número: ");
	float A = sc.nextFloat();
		
	System.out.print("Insira um número: ");
	float B = sc.nextFloat();
	
	float hipotenusa = A*A + B*B;
	System.out.println("O valor da hipotenusa do triangulo é: "+ Math.sqrt(hipotenusa));
	
	}
}
