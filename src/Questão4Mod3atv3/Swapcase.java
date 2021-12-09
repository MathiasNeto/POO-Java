package Questão4Mod3atv3;

public class Swapcase {
    String swapper(String leia) {
        char[] palavra = leia.toCharArray();
        for (int i = 0; i < palavra.length; i++) {
            if (Character.isLowerCase(palavra[i])){
                palavra[i] = Character.toUpperCase(palavra[i]);
            }else{
                palavra[i] = Character.toLowerCase(palavra[i]);
            }
        }return new String(palavra);
    }
}
