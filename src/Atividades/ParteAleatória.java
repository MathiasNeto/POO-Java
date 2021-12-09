package Atividades;

import java.util.Arrays;

public class ParteAleatória {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double numero = array[(int) Math.floor(Math.random() * array.length)];
        System.out.println("Dentro do array "+ Arrays.toString(array)+",\nO número Sorteado foi: " +numero+" !");
    }
}
