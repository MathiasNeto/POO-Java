//Crie um programa que calcule o custo de um eletrodoméstico ligado (potência, preço por kw, tempo ligado)
//Exemplo: computador de 150W funcionando 10 horas por dia durante 1 mês (30 dias)
//Consumo = 1 x 150W x 10 horas/dia x 30 dias
package Atividades;

public class Custoeletro {
    public static void main(String[] args) {
        double precokh = 1;
        String eletronico = "computador";
        int potencia = 6000/1000;
        int horas = 4;
        String custo = ("O "+eletronico+ " com potecia de "+potencia+"Kh ligado por "+horas+"horas durante 30 dias "+" o custo é de: "+ potencia*horas*precokh+" REAIS");
        System.out.println(custo);
    }
}
