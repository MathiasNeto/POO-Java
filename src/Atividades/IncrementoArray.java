package Atividades;

import java.util.Arrays;

public class IncrementoArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,8};
        System.out.println("Antes:  "+Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            num [i]+=1;

        }

        System.out.print("Depois: "+Arrays.toString(num));
    }
}
