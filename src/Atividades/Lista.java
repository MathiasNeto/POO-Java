package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    //A principal diferença entre um array e uma lista é que no array eu preciso definir o tamanho do array enquanto na lista eu nao
    //preciso definir o tamanho dela, o tamanho da lista aumenta conforme eu for digitando elementos nela

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.print("Adicionar mais numeros ");
            String line = teclado.nextLine();
            if (line.equals("n")){
                break;
            }
            System.out.print("Digite o numero: ");
            int num = Integer.parseInt(teclado.nextLine());
            numbers.add(num);
        }
        /*System.out.println("tamanho da lista: "+numbers.size());
        System.out.println(numbers);
        System.out.println(numbers.get(3));
        System.out.println(numbers.set(1,3)); //Trocar 
        System.out.println(numbers);*/
    }
}
