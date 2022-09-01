
public class ordembolha {

    public static void bubbleshort (int[] vetor){
        int aux = 0;

        //fase de ordenação

        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length - i - 1; j++) {
                //troca dos elementos
                if(vetor[j]>vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+1] = aux;
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
            System.out.println(vetor[i]);
        }
    }
}
