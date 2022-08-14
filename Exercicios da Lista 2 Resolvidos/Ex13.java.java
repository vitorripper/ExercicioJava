import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double  base = 1;
	    double topo = 1;
	    int N = 1;
	    double resul = 1;
	
	    System.out.print("Digite um número de sequências");
	    int n = sc.nextInt();
	
	    for(int i = 0; i < n; i++){
	        topo *=(N + 1);
	        base *=(N + 2);
	        n++;
	        resul+= topo/base;
	    }
	    System.out.printf("%.2f",resul);
	}
}
