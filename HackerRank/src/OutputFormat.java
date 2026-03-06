import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++){

            String s1=sc.next();
            int x=sc.nextInt();

            int tamanhoS1 = s1.length();

            while (tamanhoS1 < 15){
               tamanhoS1++;
               s1 += " ";
            }
            if (x<100){
                String numeroFomatado = String.format("%03d", x);
                System.out.println(s1 + numeroFomatado);
            } else {
                System.out.println(s1 + x);
            }


        }
        System.out.println("================================");
    }
}
