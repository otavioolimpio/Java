package academy.devdojo.mataronajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main() {
        //while, do while, for
        int count = 0;
        while(count<10){
            count++;
            System.out.println(count);
        }

        //do while executa ao menos uma vez
        do {
            count++;
            System.out.println(count);
        } while (count<20);

        //for
        for (int i = count; i<30; i++){
            count++;
            System.out.println(count);
        }

    }
}
