import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número a: ");
		int a = sc.nextInt();
		System.out.print("Digite o número b: ");
		int b = sc.nextInt();
		System.out.print("Digite o número c: ");
		int c = sc.nextInt();
		System.out.print("Digite o número d: ");
		int d = sc.nextInt();
		
		if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 ==0 ){
		    System.out.println("Os valores são aceitos");
		}
		else{
		    System.out.println("Os valores não são aceitos");
		}
		
		
	}
}

