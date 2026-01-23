package academy.devdojo.mataronajava.introducao;

/*
Prática:
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario  de <salario>,
na data <data>
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args){
        String nome = "Otávio";
        String endereco = "R.Daniel Freire Bastos, 186";
        double salario = 1800;
        String dataRecebimentoSalario = "10/04/2024";
        String relatorio =("Eu " + nome + ", morando no endereço " + endereco + ",\n" +
                "confirmo que recebi o salario  de R$"+ salario + ", na data " + dataRecebimentoSalario);
        System.out.println(relatorio);
    }
}
