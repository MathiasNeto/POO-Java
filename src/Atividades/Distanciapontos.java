//A = (4, -8, -9) e B = (2, -3, -5).
//
package Atividades;

public class Distanciapontos {
    public static void main(String[] args) {
        int xa = 4;
        int xb = -8;
        int ya = 2;
        int yb = -3;
        double d = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
        System.out.println(d);
    }
}

