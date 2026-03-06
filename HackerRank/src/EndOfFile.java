import java.util.Scanner;

public class EndOfFile {
    static void main() {
       Scanner sc = new Scanner(System.in);
       int count = 0;
       while(sc.hasNext()) {
           String text = sc.nextLine();
           count++;
           System.out.println(count + " " + text);
      }

    }
}
