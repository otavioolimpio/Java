package academy.devdojo.mataronajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    //Imprima todos os numeros pares de 0 até 10000
    public static void main() {
        for (int i = 0; i <= 10000; i++ ){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
