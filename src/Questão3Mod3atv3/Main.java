package Questão3Mod3atv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String teclado = entrada.nextLine();
        Isupper maiculas = new Isupper();
        boolean teste = maiculas.maiusculas(teclado);
        System.out.println(teste);

    }
}
