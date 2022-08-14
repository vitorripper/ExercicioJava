import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int s = 1;
            float d = 2;
            float result = 1;{
                System.out.println("Digite um valor limite ");
                int N = sc.nextInt();

                while (d < N){
                    result = result - (s/d)  ;
                    System.out.println(result);
                    d ++;


                }

            }


        }
    }

