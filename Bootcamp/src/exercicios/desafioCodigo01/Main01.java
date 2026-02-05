package exercicios.desafioCodigo01;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projeto = scanner.nextLine();

        switch (projeto){
            case "Apollo":
                System.out.println("Em andamento");
                break;
            case "Orion":
                System.out.println("Concluido");
                break;
            case "Hermes":
                System.out.println("Cancelado");
                break;
            default:
                System.out.println("Projeto nao encontrado");
                break;
        }
    }
}
