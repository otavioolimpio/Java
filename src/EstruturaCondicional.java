import java.util.Scanner;
public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total, minutos;
		minutos = sc.nextInt();
		
		if (minutos > 100) {
			
			total = ((minutos - 100) * 2) + 50;
			
		}else {
			total = 50;
		}
		
		System.out.println("Você gastou " + total);
		
		sc.close();
	}

}
