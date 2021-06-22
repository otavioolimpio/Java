import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho da matriz");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[][] matriz = new int[a][b];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Informe o valor da busca:");
		int busca = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == busca) {
					if (i > 0 ) {System.out.println("Acima " + matriz[i - 1][j]);} 
					if (j > 0) {System.out.println("Antes " + matriz[i][j - 1]);}
					if (j < matriz[i].length-1) {System.out.println("Depois " + matriz[i][j + 1]);}
					if (i < matriz.length-1) {System.out.println("Abaixo " + matriz[i + 1][j]);}
				}
			}
		}sc.close();
	}

}
