package Atividades;

public class Pg100 {
    public static void main(String[] args) {
        double inicio = 2;
        double r = 2;
        for (double i = 0; i <= 100 ; i++) {
            //System.out.println(inicio);
            //inicio *= 2;
            double an = inicio *Math.pow(r,i);
            System.out.println(an);
        }
    }
}
