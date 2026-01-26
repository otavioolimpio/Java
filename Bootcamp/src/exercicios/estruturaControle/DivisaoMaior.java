package exercicios.estruturaControle;

import java.util.Scanner;

public class DivisaoMaior {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int primeiroValor = scanner.nextInt();

        int outroValor;
        int restoDivisao = 0;

        do {
            System.out.print("Informe outro número: ");
            outroValor = scanner.nextInt();

            if (outroValor < primeiroValor) {
                System.out.println("O valor é menor que o primeiro, tente novamente!");
                continue;
            }

            restoDivisao = outroValor % primeiroValor;

        } while (restoDivisao == 0);
        System.out.print("Resto da divisão = " + restoDivisao);
    }
}