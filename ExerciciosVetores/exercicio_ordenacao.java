public class exercicio_ordenacao {

    public static void bubbleshort (int[] vetor) {
        int auxiliar1 = 0;

        //fase de ordenação pares e impares

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                //troca dos elementos

                if(vetor[j] % 2 == 0 && vetor[j+1] % 2 == 0 && vetor[j] > vetor[j+1]){
                    auxiliar1 = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar1;
                }
                if(vetor[j] % 2 != 0 && vetor[j+1] % 2 != 0 && vetor[j] < vetor[j+1]){
                    auxiliar1 = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar1;
                }

                if (vetor[j] % 2 != 0) {
                    auxiliar1 = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar1;
                }


            }
        }
    }

    public static void main(String[] args) {
        int vetor [] =  new int[6];

        for (int i = 0; i < vetor.length; i++) {
            int random =  1 + (int) (Math.random() * 100);
            vetor[i] = random;
        }

        bubbleshort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }


}
