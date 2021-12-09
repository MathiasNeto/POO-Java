package Atividades;

import java.util.Arrays;

public class Arrayinvertido {
    public static void main(String[] args) {
        int[] vetor = {1,3,6,9,12};
        int auxiliar;
        System.out.println("Antes: "+Arrays.toString(vetor));
        for (int i = 0; i < vetor.length/2; i++) {

            auxiliar = vetor[vetor.length - i - 1];
            vetor[vetor.length - i - 1] = vetor[i];
            vetor[i] = auxiliar;
        }
        System.out.println("Depois: "+Arrays.toString(vetor));
    }
}
