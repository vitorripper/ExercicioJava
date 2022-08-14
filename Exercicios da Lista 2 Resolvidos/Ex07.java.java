import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 7;
    int n2 = 1;
    while(n < 196){
        n = 7 * n2;
        n2++;
        System.out.println("Os multiplos são: " + n);
    }
	}
}
