package Atividades;

import java.util.Arrays;

public class Arrayde15 {
    public static void main(String[] args) {
        int[] notas = new int[15];
        for (int i = 0; i < notas.length ; i++) {
            notas[i] = i + 1;
        }
        System.out.println(Arrays.toString(notas));
    }
}
