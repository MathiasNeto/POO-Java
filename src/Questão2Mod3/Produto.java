package Questão2Mod3;

public class Produto {
    String nome;
    double preco;
    double precoPromo;


    void mostrarDads(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Preco Promocional: "+precoPromo);
    }
    int calcularDesconto(){
        return (int) (preco - precoPromo);
    }
}
