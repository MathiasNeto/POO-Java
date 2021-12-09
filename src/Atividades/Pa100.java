package Atividades;

public class Pa100 {
    public static void main(String[] args) {
        //Criando variaveis
        int primeiro = 0; // Primeiro termo
        int razao = 4; // primeiro + razao
        int enesimo_condicao_Parada = primeiro + (10-1) * razao; // 0 + 4 (Condicao parada - 1) * 4
        for (int i = primeiro; i< enesimo_condicao_Parada + razao ; i += razao) {
            System.out.println(i - razao + " + 4: "+i);
        }
    }
}