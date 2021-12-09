package Atividades;

public class SomaPg {
    public static void main(String[] args) {
        double ini = 1;
        double termos = 10;
        double prog = 2;
        double soma = 0;
        for (double i = 1; i <= termos; i++) {
            System.out.println(ini);
            soma += ini;
            ini *= prog;

        }
        System.out.println("A soma vale: "+soma);
    }

}

        /*double a1 = 2;
        double termo = 100;
        double razao = 2;
        int soma = 0;
        int posicao = 0;
        for (int i = 1; i <= termo; i++) {
            posicao+=1;
            System.out.printf("Posicao:%d: %d7 + 2: %d \n",posicao,a1 - razao,(long)a1);
            a1 *= razao;
            soma+=a1*/
