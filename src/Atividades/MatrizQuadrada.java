package Atividades;

import java.util.Arrays;

public class MatrizQuadrada {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        int index = 0; //acessar os indices do array

        int matriz [][] = new int[4][4]; // matriz quadrada 4 por 4.

        for (int i = 0; i < matriz.length; i++) { // percorre as colunas
            for (int j = 0; j < matriz.length; j++) { // percorre cada linha de cada coluna;
                matriz[j][i] = array[index];// preenche a linha da respectiva coluna
                index++; //aumenta o contador para ir acessando os indices do array
            }


        }
        for (int i = 0; i < matriz.length; i++) { //percorre a coluna
            for (int j = 0; j < matriz.length; j++) { // percorre a linha daquela respectiva coluna
                System.out.print(matriz[j][i] + "\t"); // printa os valores de cada linha daquela respectiva coluna
            }
            System.out.println("" + "\t"); //
        }

    }
}
