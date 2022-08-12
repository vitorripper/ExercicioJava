import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Insira o seu ID: ");
	int ID = sc.nextInt();
	
	System.out.print("Insira suas horas trabalhadas: ");
	float HT = sc.nextFloat();
	
	System.out.print("Insira o seu salário por hora: ");
	float SH = sc.nextFloat();
	
	float salario = SH * HT;
	
	System.out.println("O funcionário " + ID + " recebe o salário de: R$ " + salario );
	
	}
}
