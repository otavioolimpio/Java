package exercicios.fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho da base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Informe o tamanho da altura do triângulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.print("A área do triângulo é: " + area);
    }

}
