package ResolucaoATV2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você quer?");
        int count = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            double nota = Double.parseDouble(scanner.nextLine());
            total += nota;
        }

        double media = total / count;

        System.out.println("Media: " + media);
    }
}
