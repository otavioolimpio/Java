import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var canDrive = (age >= 18);
        System.out.printf("Você pode dirigir? %s \n", canDrive);
    }
}