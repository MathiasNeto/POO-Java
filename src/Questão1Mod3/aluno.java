package Questão1Mod3;

public class aluno {
    //São os atributos da instânçia aluno
    String nome;
    int idade;
    double nota1;
    double nota2;
    double nota3;

    // Metodos
    // esxistem dois tipos de metodos
    //o que tem retorno e o que não tem retorno
    //o que não tem retorno são aqueles que execultam uma açao.
    //o que tem retorno são aqueles que me retorna algo de uma ação, um
    double calcularmedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void mostrardados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("1 Nota: " + nota1);
        System.out.println("2 Nota: " + nota2);
        System.out.println("3 Nota: " + nota3);

    }

    int soma(int n1, int n2) {
        return n1 + n2;
    }

    void resultado(){
        System.out.print("Você está ");
        if(calcularmedia() < 4){
            System.out.println("Reprovado");
        }else if (calcularmedia() < 7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Aprovado");
        }
    }
}