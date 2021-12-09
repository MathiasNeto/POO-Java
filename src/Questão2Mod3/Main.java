package Questão2Mod3;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Sabonetes Perfumados";
        produto1.preco = 39.90;
        produto1.precoPromo = 29.90;

        produto1.mostrarDads();

        System.out.printf("Os %s teve um Desconto de %d Reais.",produto1.nome,produto1.calcularDesconto());

    }
}
