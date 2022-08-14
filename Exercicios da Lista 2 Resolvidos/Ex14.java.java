import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float s = 2;
        float d = 3;
        float contad = 2;
        float result = 1;{
            System.out.println("Digite um valor limite ");
            int N = sc.nextInt();

            while (d < N || s < N){

                System.out.println(result);
                result = result + (s/d)  ;
                s = contad + s;
                d = contad + d;

            }
        }
    }
}

