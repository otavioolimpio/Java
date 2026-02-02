package academy.devdojo.mataronajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main() {
        //Essa atividade consiste em calcular o imposto baseado no salario
        int salario = 3000;
        double imposto;
        double recebido;

        if(salario<2000){
            imposto = salario/100 * 10;

        } else if (salario < 4000) {
            imposto = salario/100 * 20;

        } else {
            imposto = salario/100 * 30;
        }
        recebido = salario - imposto;
        System.out.println(recebido);
    }
}
