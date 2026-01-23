package academy.devdojo.mataronajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int,double, float, char, byte, short, long, boolean
        int age = 10;
        int ageCast = (int) 100000000000L;
        long bigNumber = 100000L;
        double salaryDouble = 2000.0D;
        double salaryFloat = 2500.0F;
        byte ageByte = 127;
        short ageShort = 33;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 70;
        // Não é tipo primitivo é uma classe
        String nome = "Otávio";
        System.out.println("Age is " + age + " years");
        System.out.println(verdadeiro);
        System.out.println("char: " + caractere);
        System.out.println("Age Cast: " + ageCast);
        System.out.println("Name: " + nome);

    }
}
