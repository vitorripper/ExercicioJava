import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		    int i = 0;
		    double saldoInicial = 0;
		    int operacao = 0;
		    double saldoAtual = saldoInicial;
		    
		    
		    
		
		
		
		    do{
		        System.out.print("Digite uma operação, ([1] Deposito, [2] Saque, [3] Sair)");
		        int operação = sc.nextInt();
		        
		        switch(operação){
		        
		        case '1':
		        System.out.print("[1] Digite o valor do seu deposito: ");
		        double deposito = sc.nextDouble();
		        double saldoAtual = saldoAtual + deposito;
		        System.out.println("Saldo atual " + saldoAtual);
		        break;
		        case '2':
		        System.out.print("[2] Digite o valor do seu saque: ");
		        double saque = sc.nextDouble();
		        double saldoAtual = saldoAtual - saque;
		        System.out.println("Saldo atual " + saldoAtual);
		        break;
		        case '3':
		        System.out.print("Sair !!!");
		        break;
		        default:
		        System.out.println("Operação Invalida !!!");
		        break;
		        }
		        
		        

		        
		    }
		    while(operacao != 3);
		    
		    if(saldoAtual == 0){
		        System.out.println("CONTA ZERADA !!!");
		    }
		    else if (saldoAtual < 0){
		        System.out.println("CONTA NEGATIVADA !!!");
		    }
		    else if (saldoAtual > 0){
		        System.out.println("CONTA PREFERENCIAL !!!");
		    }
		    
		    
	}
}
