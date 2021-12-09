package Atividades;

public class delta {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = -5;
        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println(-b+(Math.sqrt(delta) / (2 * a)));
        System.out.println(-b-(Math.sqrt(delta) / (2 * a)));
    }
}
