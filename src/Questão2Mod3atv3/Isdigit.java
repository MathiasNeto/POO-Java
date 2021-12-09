package Questão2Mod3atv3;

public class Isdigit {
    boolean classe(String digitos) {
        char[] digits = digitos.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (!Character.isDigit(digits[i])) {
                return false;
            }
        }
        return true;
    }
}