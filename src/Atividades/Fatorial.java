package Atividades;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int fatorial = Teclado.nextInt();
        int resul = 1;
        for (int i = fatorial; i >=1 ; i--) {
            System.out.println(resul);
            resul *= i;
        }
        System.out.println("Fatorial de "+fatorial+"! : "+resul);
    }
}
