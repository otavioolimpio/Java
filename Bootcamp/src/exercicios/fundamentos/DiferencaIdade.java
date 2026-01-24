package exercicios.fundamentos;

import java.util.Scanner;

public class DiferencaIdade {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Informe a idade da primeira pessoa:");
        int idadePrimeiraPessoa = scanner.nextInt();
        System.out.print("Informe a idade da segunda pessoa:");
        int idadeSegundaPessoa = scanner.nextInt();
        int diferencaIdade = Math.abs(idadePrimeiraPessoa - idadeSegundaPessoa);
        System.out.print("A diferença de idade entre as pessoas é " + diferencaIdade + " anos.");
    }
}
