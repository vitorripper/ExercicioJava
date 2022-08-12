import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Insira o seu nome: ");
	String nome = sc.next();
	
	System.out.print("Insira o valor do seu sálario: ");
	float salario = sc.nextFloat();
	
	System.out.print("Insira o valor em dinheiro do total de vendas no mês: ");
	float vendasM = sc.nextFloat();
	
	float salarioT = (vendasM * 0.15f) + salario;
	
	System.out.println("O funcionário " + nome + " recebeu no fim do mês o total de:R$ " + salarioT);
	
	}
}
