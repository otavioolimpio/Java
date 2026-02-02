package academy.devdojo.mataronajava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main() {
        int idade = 20;
        boolean autorizaçãoCNH = idade >= 18;
        //if sempre deve retornar um booleano
        if(autorizaçãoCNH){
            System.out.println("Autorizado a tirar a CNH");
        } else {
            System.out.println("Não pode tirar CNH");
        }
    }
}
