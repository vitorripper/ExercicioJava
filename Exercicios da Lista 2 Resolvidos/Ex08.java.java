import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = 0;
	int numero = 0;
	int media =0;
	
	    for (i = 13;i <= 73 ; i++ ) {
	        if(i % 2 == 0){
	            i += numero;
	            media++;
	            
	            
	        }
	    }
	    System.out.printf("A media aritmética de todos números pares são %d " , (i/media));
	}
}
