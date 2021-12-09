package Atividades;

import java.util.Arrays;

public class ParteSuperiorParteInferior {
    public static void main(String[] args) {
        int []array = {1,3,2,5,63,7};
        int aux = 0;
        System.out.println("Anes "+ Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            aux = array[array.length/2 + i];

            array[array.length/ 2 + i] = array[i];

            array[i] = aux;
        }
        System.out.println("Depois: "+Arrays.toString(array));
    }
}

