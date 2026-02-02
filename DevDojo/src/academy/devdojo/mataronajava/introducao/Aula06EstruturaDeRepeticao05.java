package academy.devdojo.mataronajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    //Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
    //Condição valorParcela >= 1000
    static void main() {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}