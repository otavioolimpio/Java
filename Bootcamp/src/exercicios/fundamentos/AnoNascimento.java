package exercicios.fundamentos;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var data_atual = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var nome = scanner.next();
        System.out.println("Informe seu ano de nascimento");
        var ano = scanner.nextInt();
        var idade = data_atual - ano;
        System.out.printf("Olá, %s, você tem %s anos.", nome, idade);
    }
}