package Atividades;

public class Digosnum {
    public static void main(String[] args) {
        int num = 123345;
        int soma = 0;
        for (int i = 0; num>0; num/=10) {
            soma++;
        }
        System.out.println(soma);
    }
}
