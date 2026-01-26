package exercicios.estruturaControle;

import java.util.Scanner;

public class SelecaoParImpar {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int valorInicial = scanner.nextInt();
        System.out.print("Insira o segundo valor: ");
        int valorFinal = scanner.nextInt();

        System.out.print("Para os numeros ímpares tecle 1 | Para os numeros pares tecle 2: ");
        int selecao = scanner.nextInt();

        for (int i = valorInicial; i <= valorFinal; i++){
            if (selecao == 1){
                if (i % 2 != 0){
                    System.out.print(i);
                }
            } else if (selecao == 2){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            } else {
                System.out.print("Informe um valor válido!");
            }
        }

    }
}
