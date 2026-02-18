import br.com.dio.desafio.doominio.*;

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

        mentoria1.setTitulo("Mentoria 1 Java");
        mentoria1.setDescricao("Descrição da mentoria Java");
        mentoria1.setDataInicio(LocalDate.now());

//        Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

//        Dev
        Dev devGleidson = new Dev();
        devGleidson.setNome("Gleidson ");
        devGleidson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devGleidson.getNome() + devGleidson.getConteudosInscritos());
        devGleidson.progredir();
        System.out.println("Conteúdos Inscritos " + devGleidson.getNome() + devGleidson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devGleidson.getNome() + devGleidson.getConteudosConcluidos());
        System.out.println("XP: " + devGleidson.calcularXp());
        devGleidson.progredir();
        System.out.println("XP: " + devGleidson.calcularXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devCamila.getNome() + devCamila.getConteudosConcluidos());
    }

}

