package Atividades;

public class IMC {
    public static void main(String[] args) {
        double peso = 59.3;
        double altura = 1.98;
        double imc = peso / Math.pow(altura,2);
        System.out.println("Seu IMC é igual a: "+Math.round(imc));
    }
}
