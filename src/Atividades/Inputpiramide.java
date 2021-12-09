package Atividades;

import java.util.Scanner;

public class Inputpiramide {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inf a altura da piramide: ");
        double alt = teclado.nextDouble();
        String a = "*";
        for (int i = 1; i <= alt; i++) {
            System.out.println(a);
            a+="*";
        }
    }

}
