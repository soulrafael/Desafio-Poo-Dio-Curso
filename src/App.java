import java.time.LocalDate;

import br.com.desafio.dominio.*;


public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();


        curso1.setCurso("JAVA");
        curso1.setTitulo("Descrição sobre JAVa");
        curso1.setCargahoraria(1);
        
        curso2.setCurso("JVM");
        curso2.setTitulo("Descrição sobre JVM");
        curso2.setCargahoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
