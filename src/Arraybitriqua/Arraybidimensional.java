package Arraybitriqua;

import java.util.Arrays;

public class Arraybidimensional {
    public static void main(String[] args) {
        int [][] numeros = new int[4][4];//primeiro indice indentifica as linhas, o segundo indice indentifica as colunas
        //System.out.println(numeros[1][2]);
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(Arrays.toString(numeros[i]));


        }

    }
}
