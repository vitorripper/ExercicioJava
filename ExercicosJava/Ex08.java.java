
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Insira um número: ");
		float N1 = sc.nextFloat();
		
		System.out.print("Insira um número: ");
		float N2 = sc.nextFloat();
		
		System.out.print("Insira um número: ");
		float N3 = sc.nextFloat();
		
		System.out.print("Insira um número: ");
		float N4 = sc.nextFloat();
		
		float media = (N1+N2+N3+N4)/4;
		System.out.println("O valor da média aritmética é : " + media);
	}
}
