import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int i = 0;
    float media = 0;
    float resultado = 0;
    float n2 = 0;
    
    
    System.out.print("Quantos alunos existem na sala? ");
    int n1 = sc.nextInt();
        
        while(i < n1 ){
            System.out.print("Qual a nota desse aluno ? ");
            n2 = sc.nextFloat();
            resultado += n2;
            i++;
            media++;
            
        }
      
    System.out.printf("A média das notas dos alunos são %.2f" ,(resultado/n1) );
	}
}
