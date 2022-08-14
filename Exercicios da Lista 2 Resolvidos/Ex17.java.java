import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		    System.out.print("Digite um número: ");
			int num= sc.nextInt();
			
			
			for(int divisor = 1; divisor <= num; divisor++) {
				if (num % divisor!=0) {
			
				continue;
			}
				else {
					System.out.println("Divisor de " +num+":"+ divisor);
				}
	}
			

	}
}

