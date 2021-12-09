package Atividades;

import java.util.Arrays;

public class Matriztransp {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        int index = 0;

        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i] = array[index];
                index++;
            }
        }
        System.out.println("Matriz Original: \n");

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Matriz transposta :\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");

            }
            System.out.println("");
        }
    }
}
