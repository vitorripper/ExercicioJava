import java.util.Scanner;

    public class exercicio01 {
        public static void bubbleshort(int[] vetor) {
            int aux = 0;

            //fase de ordenação

            for (int i = 0; i < vetor.length; i++) {
                for (int j = 0; j < vetor.length - i - 1; j++) {
                    //troca dos elementos
                    if (vetor[j] > vetor[j + 1]) {
                        aux = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = aux;
                    }

                }
            }

        }

        //fase de verificação
        public static String procurar(int vetor[], int user) {
            for (int i = 0; i < vetor.length; i++) {

                if (user == vetor[i]) {
                    return ("O numero se encontra no indice: " + i);
                }

            }
            return ("O numero verificado não está dentro do vetor");
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            int vetor[] = new int[6];


            for (int i = 0; i < vetor.length; i++) {
                int random = 1 + (int) (Math.random() * 100);  // COLOCANDO NUMEROS RANDOM DENTRO DO VETOR
                vetor[i] = random;
            }

            bubbleshort(vetor);

            System.out.println("VALOR DOS VETORES");

            for (int i = 0; i < vetor.length; i++) {       //IMPRIMINDO VETORES
                System.out.print(vetor[i] + " ");

            }

            System.out.print("\nDê um numero para verificação? ");     //PERGUNTANDO QUAL NUMERO QUER VERIFICAR DENTRO DO VETOR
            int ver = sc.nextInt();


            System.out.println(procurar(vetor, ver));    //PUXANDO A FUNÇÃO 'PROCURAR' PARA INFORMAR SE O NUMERO ESTÁ DENTRO DO VETOR OU NÃO

        }
    }



