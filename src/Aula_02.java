import java.util.Scanner;

public class Aula_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
		System.out.printf("SOMA = %d%n", z);
		
		sc.close();

	}

}
