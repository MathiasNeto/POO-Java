package Questão4Mod3atv3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String leia = teclado.nextLine();


        Swapcase obj1 = new Swapcase();
        String aux = obj1.swapper(leia);

        System.out.println(aux);

    }
}