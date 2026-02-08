import br.com.dio.desafio.doominio.Curso;
import br.com.dio.desafio.doominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        curso1.setTitulo("Curso 1 Java");
        curso1.setDescricao("Descrição do curso 1 Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2 Spring boot");
        curso2.setDescricao("Descrição do curso 2 Spring boot");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso 3 Banco de dados");
        curso3.setDescricao("Descrição do curso 3 Banco de dados");
        curso3.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3 + "\n");


        mentoria1.setTitulo("Mentoria 1 Java");
        mentoria1.setDescricao("Descrição da mentoria Java");
        mentoria1.setDataInicio(LocalDate.now());

        System.out.println(mentoria1);
    }
}
