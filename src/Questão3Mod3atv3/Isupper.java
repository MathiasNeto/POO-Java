package Questão3Mod3atv3;

public class Isupper {

    boolean maiusculas(String palabra){
        char [] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if(!Character.isUpperCase(letras[i])){
                return false;
            }
        }
        return true;
    }

}