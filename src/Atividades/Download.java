//Crie um programa que calcule o tempo pra download de um arquivo (peso em mb, velocidade mb/s)
//Tamanho do arquivo em megabytes / (velocidade de download em megabits / 8) =  tempo em segundos.
//
//Um arquivo de 15 MB, baixado a 10 Mb/s: 15 / (10/8) = 12 segundos.
package Atividades;

public class Download {
    public static void main(String[] args) {
        double tmarquivoMB = 15;
        double blg = 10;
        double tempo = tmarquivoMB / (blg / 8);
        System.out.println("Com uma banda larga de "+blg+"MB voce consegue baixar um arquivo de "+ tmarquivoMB+"MB em: "+tempo+" seconds");
    }
}
