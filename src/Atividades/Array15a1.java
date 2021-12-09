package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Array15a1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de gavetas do array: ");
        int qntd = teclado.nextInt();
        int[] num = new int[qntd];
        for (int i = 0; i < num.length ; i++) {
            num[i] = num.length - i;
        }
        System.out.println(Arrays.toString(num));
    }
}