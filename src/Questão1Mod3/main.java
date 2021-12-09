package Questão1Mod3;

public class main {

    public static void main(String[] args) {
        aluno Aluno = new aluno();
        Aluno.nome = "matias";
        Aluno.idade = 13;
        Aluno.nota1 = 10;
        Aluno.nota2 = 10;
        Aluno.nota3 = 10;
        aluno aluno1 = new aluno();
        aluno aluno2 = new aluno();

        System.out.println("Média: "+Aluno.calcularmedia());
        Aluno.mostrardados();
        Aluno.resultado();


        System.out.println("Soma: "+Aluno.soma(54,4));

    }

}
