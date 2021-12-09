package Questão3Mod3;

public class Carros{
    String cor;
    String marca;
    String modelo;
    String combustivel;
    double preco;


    void ligar(){
        System.out.println("O seu carro está Ligado, se for sair preste atenção na estrada!!");
    }

    void mostrardados(){
        System.out.printf("O seu carro é da %s o modelo é %s, é um carro lindo, pois sua cor é %s, ele é movido a %s e o seu preço é %.3f Mill Reais"
        ,marca, modelo,cor,combustivel,preco);
    }

    void acelerar(int velocidade){
        if (velocidade > 0){
            System.out.printf("\nVoce está em %d Km/h, Está acelerando\n",velocidade);
        }else {
            System.out.printf("Voce está em %d Km/h, Está parado\n", velocidade);
        }
    }
    void frear(){
        System.out.println("FREANDO");
    }

}
