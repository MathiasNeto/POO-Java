package Atividades;

import java.util.Scanner;

public class Inputsomapg {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inf. o primeiro valor da P.G: ");
        Double ini = teclado.nextDouble();
        System.out.print("Inf a razao da sua P.G: ");
        double raz = teclado.nextDouble();
        System.out.print("Inf a quantidade de termos da PG: ");
        double enesimo = teclado.nextDouble();
        double soma = 0;
        for (int i = 1; i <= enesimo; i++) {
            System.out.println(ini);
            soma+=ini;
            ini*=raz;
        }
        System.out.println("A soma vale: "+soma);
    }
}
