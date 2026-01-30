import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    static void main() {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do Curso Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descricao do Curso de JavaScript");
        curso2.setCargaHoraria(8);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria do curso de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev otavio = new Dev();
        otavio.setNome("Otavio");

        otavio.inscreverBootcamp(bootcamp);
        otavio.progredir();
        otavio.progredir();
        otavio.progredir();
        System.out.println("---------------------------");
        System.out.println("Conteúdos Inscritos: " + otavio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + otavio.getConteudosConcluidos());
        System.out.println("XP = "+otavio.calcularXPtotal());


    }
}
