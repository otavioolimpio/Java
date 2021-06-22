import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double meassure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", produto1, price1);
		System.out.printf("%s, which price is $ %.2f%n", produto2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", idade, codigo, genero);
		System.out.println();
		System.out.printf("Measue, with eight decimal places: %.8f%n", meassure);
		System.out.printf("Rouded (three decimal place): %.3f%n", meassure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal point: %.3f%n", meassure);
		
	}

}
