import java.util.Scanner;
import java.util.Locale;
public class CalculoSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double horas = sc.nextDouble();
		double valor_horas = sc.nextDouble();
		double salario = horas * valor_horas;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salario = %.2f%n", salario);
		
		sc.close();
		
	}

}
