package academy.devdojo.mataronajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main() {
        //idade < 15 - Categoria Infantil
        //idade >= 15 && idade < 18 Categoria Juvenil
        //idade > 18 Categoria adulto

        int idade = 17;
        String categoria;
        if(idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15){
            categoria = "Categoria Juvenil";
        } else {
           categoria = "Categoria adulto";
        }
    }
}
