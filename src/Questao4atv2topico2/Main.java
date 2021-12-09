package Questao4atv2topico2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        Scanner inp2 = new Scanner(System.in);
        int num2 = inp.nextInt();
        Numero numero = new Numero();
        numero.num(num,num2);
    }
}
