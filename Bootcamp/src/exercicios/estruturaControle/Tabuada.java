package exercicios.estruturaControle;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Insira um valor para Tabuada: ");
        int numero = scanner.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(numero + " x " + i + " = " + i*numero);
        }
    }
}
