package Questão2Mod3atv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String digitos = Teclado.nextLine();

        Isdigit isdigit = new Isdigit();
        boolean teste = isdigit.classe(digitos);
        System.out.println(teste);



    }

}
