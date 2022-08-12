import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Insira um número: ");
	float L = sc.nextFloat();
	
	System.out.print("Insira um número: ");
	float R = sc.nextFloat();
	
	float areaQ = L*L;
	float areaC = (float) Math.PI*(R*R);
	
	if(areaQ > areaC){
	    System.out.println("A maior área é do quadrado com o valor de: %2f" + areaQ);
	}
	else{
	    System.out.printf("A maior área é do círculo com o valor de: %.2f ", areaC);
	}
	
	
	}
}
