/*
package exercicios.desafioCodigo;

import java.util.Scanner;

class Projeto1 {
    private final String codigo = "";
    int hifen = codigo.indexOf('-');

    public String validar() {
        int primeiroHifen = codigo.indexOf('-');
        int ultimoHifen = codigo.lastIndexOf('-');

        if (primeiroHifen == -1 || primeiroHifen != ultimoHifen) {
            return "INVALIDO";
        }

        String departamento = codigo.substring(0, primeiroHifen);
        String numero = codigo.substring(primeiroHifen + 1);

        if (!departamento.matches("[a-z]+")) {
            return "INVALIDO";
        }

        if (!numero.matches("[1-9][0-9]*")) {
            return "INVALIDO";
        }

        return departamento.toUpperCase();
    }

}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();

        Projeto1 projeto = new Projeto1(codigo);
        System.out.println(projeto.validar());
    }
}*/