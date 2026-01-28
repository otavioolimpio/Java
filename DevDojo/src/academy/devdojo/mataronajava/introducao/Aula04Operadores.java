package academy.devdojo.mataronajava.introducao;

public class Aula04Operadores {
    static void main() {

        // Operadores básicos  + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02-numero01;
        System.out.println(resultado);

        // Resto da divisão %
        int resto = 21 % 7;
        System.out.println(resto);

        // Operadores Relacionais < > <= >= == != (Sempre retorna boleano)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // Operadores Logicos - (&&) AND  - (||) OR - (!) NOT
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 2612;
        System.out.println(isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCompravel);


        // Operadores de Atribuicao (=) (+=) (-=) (/=) (*=) (%=)
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        // Incrementador (++) (--)
        int contador = 0;
        contador++; // Executa e depois incrementa
        --contador; // Decrementa e depois executa
        System.out.println(contador);


    }
}
