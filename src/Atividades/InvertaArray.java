package Atividades;


import java.util.Arrays;

public class InvertaArray {
    public static void main(String[] args) {
        int[] nota = {123, 22, 30, 20, 10,2};
// 1 vez for: 123 por 2, {2,22,30,20,10,123}
// 2 vez for: 22 por 10 {2,10,30,20,22,123}
// 3 vez for: 30 por 20 { 2,10,20,30,22,123 }

        System.out.println("Antes: "+Arrays.toString(nota)+"\n");

        int aux1 = 0; //essa variavel é pra ir guardando o resultado dos passos que o for execulta
        System.out.println("Tamanho do Array "+nota.length + " Dividido por 2: "+nota.length/2+" alteraçôes do Array \n");

        for (int i = 0; i < nota.length/2; i++) { // Nesse caso O for vai rodar 3 vezes o que tá em baixo
            System.out.print(i+1+" rodada Trocando ");

            aux1 = nota[nota.length - i - 1];

// na primeira vez que rodar o for, vai guardar dentro da variavel aux,

            System.out.println(" "+nota[i]+" por "+aux1+"\n");

// o que ele encontrou na posicao 5 do array nota

            nota[nota.length - i - 1] = nota[i];

 // aqui ele vai pegar nota na posicão[i: que é a primeira vez da rodada for] que i é 0
//então nota na posicao 0, temos 123, e vai fazer a troca do que ele tinha  encontrado na posiçao 5 com o que
//ele encontrou na posicao 0, entao vai ficar {123 ,22,30,20,10,123}

            nota[i] = aux1;

//Aqui na primeira rodada nota[i] vai receber o que foi guuardado em aux nessa primeira rodada
//nota[0] = vai receber 2
//




        }

        System.out.println("Depois: "+Arrays.toString(nota));
    }
}

