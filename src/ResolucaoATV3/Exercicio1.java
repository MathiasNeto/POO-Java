package ResolucaoATV3;

import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        double tax = 0.05;
        int time = 3;

        double[] bank = {1000, 2000, 500, 700, 20};

        for (int i = 0; i < bank.length; i++) {
            System.out.println("Conta " + i + " saldo " + bank[i]);
            for (int j = 0; j < time; j++) {
                bank[i] *= 1 + tax;
                System.out.println("Ano " + (j + 1) + " saldo " + bank[i]);
            }
        }

        System.out.println(Arrays.toString(bank));
    }
}
