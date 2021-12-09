package Questão1Mod3atv3;

public class Captilaize {

    String capt(String Palavra) {



        char[] letras = Palavra.toCharArray();
        letras[0] = Character.toUpperCase(letras[0]);
        return new String(letras);
    }
}