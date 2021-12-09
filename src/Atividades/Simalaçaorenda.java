package Atividades;

import java.util.Arrays;

public class Simalaçaorenda {
    public static void main(String[] args) {
        int valor_inicial = 1000;
        double taxa = 5.56 / 100;
        int tempo = 2;
        System.out.println(valor_inicial*Math.pow(taxa + 1,tempo));
        
        double [] bannk = {1000, 2000, 500, 700, 20};
        for (int i = 0; i < bannk.length; i++) {
            for (int j = 0; j < tempo; j++) {
                bannk[i] *= 1 + taxa;
            }
            
        }
        System.out.println(Arrays.toString(bannk));
    }
}
