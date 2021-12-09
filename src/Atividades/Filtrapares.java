package Atividades;

public class Filtrapares {
    public static void main(String[] args) {
        int array[] = {3,44,66,74,65,67,75,82,33};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println("Par: "+array[i]);
            }
        }
    }
}
