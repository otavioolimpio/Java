package academy.devdojo.mataronajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main() {
        double salario = 6000;

        //Operador ternário
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500" : "Eu não vou doar nada";

        System.out.println(resultado);
    }
}
