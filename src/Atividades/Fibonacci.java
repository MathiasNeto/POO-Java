package Atividades;

public class Fibonacci {
    public static void main(String[] args) {
        int variavel = 0;
        int variavel1 = 1;
        System.out.println(variavel1);
        for (int i = 1; i < 11; i++) {
            int soma = variavel + variavel1;
            System.out.println(soma);
            variavel = variavel1;
            variavel1 = soma;
        }
    }
}
