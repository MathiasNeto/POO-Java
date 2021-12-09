package ResolucaoATV;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira seu nome: ");
            String name = scanner.nextLine();
            System.out.print("Insira seu sobrenome: ");
            String lastName = scanner.nextLine();
            System.out.print("Digite sua idade: ");
            String age = scanner.nextLine();
            System.out.println("Bom dia, " + name + " " + lastName);
            int ageNumber = Integer.parseInt(age);
            System.out.println("Sua idade:" + ageNumber);


        }
    }