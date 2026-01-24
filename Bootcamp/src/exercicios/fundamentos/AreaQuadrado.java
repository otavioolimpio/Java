package exercicios.fundamentos;
import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }
}
