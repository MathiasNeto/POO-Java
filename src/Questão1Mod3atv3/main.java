package Questão1Mod3atv3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner letrax = new Scanner(System.in);
        String letras = letrax.nextLine().toLowerCase();


        Captilaize letra = new Captilaize();
        String nstring = letra.capt(letras);
        System.out.println(nstring);



    }
}
