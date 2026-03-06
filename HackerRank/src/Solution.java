import java.util.Scanner;

public class Solution {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int n;
        int resultado;

        int repetir = scanner.nextInt();

        for (int i = 0; i<repetir; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            resultado = a;

            for (int j = 0; j < n; j++) {
                resultado += (int) Math.pow(2, j) * b;

                System.out.print(resultado + " ");
            }
            System.out.println();
        }
    }
}
