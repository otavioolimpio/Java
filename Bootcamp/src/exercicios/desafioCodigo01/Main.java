package exercicios.desafioCodigo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando = scanner.nextLine().toUpperCase();

        switch (comando){
            case "GET_STATUS":
                System.out.println("API OK");
                break;
            case "GET_VERSION":
                System.out.println("v1.0.0");
                break;
            case "RESTART":
                System.out.println("RESTARTING");
                break;
            default:
                System.out.println("INVALID COMMAND");
                break;
        }

    }
}
