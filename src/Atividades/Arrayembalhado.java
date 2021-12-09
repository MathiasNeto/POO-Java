package Atividades;

import java.util.Arrays;

public class Arrayembalhado {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9,10};
        int cont = 1;
        int aux;
        for (int i = 0; i < array.length; i+=2) {
            aux = array[cont];
            array[cont] = array[i];
            array[i] = aux;
            cont++;
        }
        System.out.println(Arrays.toString(array));

    }
}
