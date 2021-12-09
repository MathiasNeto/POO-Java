package Atividades;

public class Matrizrotaciona {
    public static void main(String[] args) {
        int []array = {0,1, 2, 3, 4, 5, 6,7,8};

        int cont = 0;
        int [][]matriz = new int[3][3];//[LINHAS][COLUNAS]

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i] = array[cont];

                cont++;
            }
        }
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+"\t");
            }
            System.out.println("");
        }
        System.out.println("---------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println("");
        }

    }
}
