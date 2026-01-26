package exercicios.estruturaControle;

import java.util.Scanner;

public class IndiceMassaCorporea {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.print("Insira seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Insira sua altura: ");
        double altura = scanner.nextDouble();

        var imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.print("Abaixo do peso");
        } else if (imc <= 24.9){
            System.out.print("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.print("Levemente acima do peso");
        } else if(imc <= 34.9) {
            System.out.print("Obesidade Grau I");
        } else if(imc <= 39.9) {
            System.out.print("Obesidade Grau II - Severa");
        } else if(39.9 < imc) {
            System.out.print("Obesidade Morbida");
        } else {
            System.out.print("Opção Invalida!");
        }
    }
}
