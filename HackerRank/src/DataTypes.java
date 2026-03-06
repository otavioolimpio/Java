import java.util.InputMismatchException;
import java.util.Scanner;

public class DataTypes {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long x;

        for (int i = 0; i < t; i++) {

            try {
                x = (long) sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= -2147483648 && x <= 2147483647) {

                    if (x >= -32768 && x <= 32767) {

                        if (x >= -128 && x <= 127) {
                            System.out.println("* byte");
                        }

                        System.out.println("* short");
                    }
                    System.out.println("* int");
                }
                System.out.println("* long");

            } catch (InputMismatchException e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
