package Questão2Mod3atv2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //Entrada de dados (input)
        Scanner scanner = new Scanner(System.in);

        //Array de contatos inicial
        Contato[] contatos = new Contato[3];

        //Laço de repetição infinitas vezes
        while (true) {

            //Verifica se o usuário quer cadastrar novo contato
            System.out.println("Cadastrar novo contato? (s/n)");
            String line = scanner.nextLine();

            //Se o usuário digitar n sai do while
            if (line.equals("n")) {
                break;
            }

            //Pegando os dados do contato
            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();
            System.out.println("Digite o telefone:");
            String telefone = scanner.nextLine();

            //Preenche o objeto com os dados de entrada
            Contato contato = new Contato();
            contato.nome = nome;
            contato.telefone = telefone;

            //Variável que verifica se foi possível inserir o contato no array
            boolean inserido = false;

            //Procura um espaço vazio dentro do array
            for (int i = 0; i < contatos.length; i++) {
                //Verifica se o espaço analisado no momento está vazio
                if (contatos[i] == null){
                    //Se tá vazio, adiciona no array e marca inserido como verdadeiro
                    contatos[i] = contato;
                    //Para ele não precisar aumentar o tamanho do array
                    inserido = true;
                    //Sai do for
                    break;
                }

            }

            //Aumenta o array anterior criando um novo, pegando os que tava no antigo e adicionando no novo
            //depois coloca o novo no lugar do velho
            //Se eu não consegui inserir é porque não tem espaço
            if(!inserido){
                //Cria um array vazio de tamanho anterior + 2
                Contato[] novoContatos = new Contato[contatos.length + 2];

                //Copia os contatos antigos pro array novo
                //Porque o array novo vai entrar no lugar do antigo pois ele é maior
                for (int i = 0; i < contatos.length; i++) {
                    novoContatos[i] = contatos[i];
                }
                //Pego o contato que eu não consegui inserir
                //E insiro no novo array que é maior
                novoContatos[contatos.length] = contato;

                //A variável do contatos antigo agora é o novo
                //Para que o próximo contato que for inserido possa ser colocado pois o array é maior
                contatos = novoContatos;

            }

        }

        //Só mostra
        for (int i = 0; i < contatos.length; i++) {
            //Para quando encontra um vazio
            if(contatos[i] == null){
                break;
            }
            System.out.println("contato " + (i + 1));
            System.out.println("nome: " + contatos[i].nome);
            System.out.println("telefone: " + contatos[i].telefone);
            System.out.println("---------------------");
        }


    }


}