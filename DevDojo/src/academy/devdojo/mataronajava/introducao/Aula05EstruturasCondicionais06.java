package academy.devdojo.mataronajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main() {
        // Dados valores (1-domingo | 7 - sabado),imprima se é dia util ou fim de semana
        byte dia = 3;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Valor inválido!");
        }
    }
}
