package academy.devdojo.mataronajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
    //Condição valorParcela >= 1000
    static void main() {
       double valorTotal = 30000;
       for (int parcela = 1; parcela <= valorTotal; parcela++){
           double valorParcela = valorTotal / parcela;
           if (valorParcela < 1000){
              break;
           }
           System.out.println("Parcela " + parcela + " R$ " + valorParcela);
       }

    }
}
