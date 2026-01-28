package exercicios.desafioCodigo;
import java.util.Scanner;

class Projeto {
    private final String codigo;

    public Projeto(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProjeto() {
       int verificaInicio = codigo.indexOf('-');
       int verificaFim = codigo.lastIndexOf('-');

       if(verificaInicio == -1 || verificaInicio != verificaFim){
           return "INVALIDO";
       }

       if (verificaInicio == 0 || verificaInicio == codigo.length() -1) {
           return "INVALIDO";
       }

       return codigo.substring(verificaInicio + 1);

    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();

        Projeto projeto = new Projeto(codigo);

        System.out.println(projeto.getNomeProjeto());
    }
}