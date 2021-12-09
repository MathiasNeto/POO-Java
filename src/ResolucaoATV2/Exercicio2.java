package ResolucaoATV2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o a");
        double a = Double.parseDouble(scanner.nextLine());
        double b = 8;
        double c = 12;

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

    }
}
