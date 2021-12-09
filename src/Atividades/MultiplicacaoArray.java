package Atividades;

import java.util.Arrays;

public class MultiplicacaoArray {
    public static void main(String[] args) {
        int[] num = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            num[i]*= num[i];

        }
        System.out.println(Arrays.toString(num));
    }
}
