package Atividades;

import java.util.Arrays;

public class InverterParteInferiorArray {
    public static void main(String[] args) {
        int[] vetor = {1,8,6,4,7,2,2,3,4,4,23};
        int aux = 0;
        for (int i = 0; i < vetor.length/4; i++) {
            aux = vetor[(vetor.length/2 - i -1) ];
            vetor[(vetor.length/2 - i -1) ] = vetor[i];
            vetor[i] = aux;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
