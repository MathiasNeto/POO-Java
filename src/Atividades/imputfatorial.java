package Atividades;

import java.util.Scanner;

public class imputfatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inf um numero: ");
        int num = teclado.nextInt();
        int fat = 1;
        for (int i = num; 1 <= i; i--) {
            System.out.println(fat+" * "+i+": "+fat*i);
            fat*=i;
        }
        System.out.println(num+"! vale: "+fat);
    }
}
