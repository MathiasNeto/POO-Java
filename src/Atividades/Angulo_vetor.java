package Atividades;

public class Angulo_vetor {
    public static void main(String[] args) {
        int u = 2;
        int u2 = 4;
        int u3 = 8;
        int v = -4;
        int v2 = -2;
        int v3 = 2;
        int vetores = Math.abs((u * v) + (u2 * v2) + (u3 * v3));
        int modulodeUV = vetores / (int) Math.abs(Math.sqrt(Math.pow(u, 2) + Math.pow(u2, 2) + Math.pow(u3, 2) * (Math.pow(v,2) + (Math.pow(v2,2) + Math.pow(v3,2)))));
        System.out.println(modulodeUV);

    }
}
