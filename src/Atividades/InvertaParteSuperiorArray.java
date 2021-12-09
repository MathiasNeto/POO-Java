package Atividades;

import java.util.Arrays;

public class InvertaParteSuperiorArray {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6,32,4,56,77};
        int aux = 0;
        for (int i = 0; i < vetor.length/4; i++) {
            aux = vetor[vetor.length -i -1];
            vetor[vetor.length -i -1] = vetor[vetor.length / 2 + i];
            vetor[vetor.length / 2 + i ] = aux;

        }
        System.out.println(Arrays.toString(vetor));
    }
}
