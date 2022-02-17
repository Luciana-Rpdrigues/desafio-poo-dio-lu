import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp ();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriptor Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuciana = new Dev();
        devLuciana.setNome("Luciana");
        devLuciana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Luciana" + devLuciana.getConteudosInscritos());
        devLuciana.progredir();
        devLuciana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Luciana" + devLuciana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Luciana" + devLuciana.getConteudosConcluidos());
        System.out.println("XP:" + devLuciana.calcularTotalXp());

        System.out.println("----------------");

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Daniel" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Daniel" + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Daniel" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devDaniel.calcularTotalXp());



    }
}
