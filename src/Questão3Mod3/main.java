package Questão3Mod3;

public class main {
    public static void main(String[] args) {
     Carros carro1 = new Carros();
     carro1.cor ="Amarelo";
     carro1.preco =  53.000;
     carro1.combustivel = "Gasolina";
     carro1.marca = "Ford";
     carro1.modelo = "Fiesta";


     carro1.ligar();
     carro1.mostrardados();
     carro1.acelerar(100);
     carro1.frear();
    }
}
