package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        ProfessorTitular titular1 = new ProfessorTitular("TAIRO", "ROBERTO", 3, 111, 10);
        ProfessorTitular titular2 = new ProfessorTitular("JESSICA", "CORREA", 1, 222, 10);

        ProfessorAdjunto adjunto1 = new ProfessorAdjunto("RODRIGO", "CORDEIRO", 2, 11, "JAVA", 20);
        ProfessorAdjunto adjunto2 = new ProfessorAdjunto("FERNANDO", "CORDEIRO", 2, 22, "FULLSTACK", 20);

        List<ProfessorTitular> professorTitular = new ArrayList<>();
        professorTitular.add(titular1);
        professorTitular.add(titular2);

        List<ProfessorAdjunto> professorAdjunto = new ArrayList<>();
        professorAdjunto.add(adjunto1);
        professorAdjunto.add(adjunto2);

        // NÃO CONSEGUI LINKAR COM O CADASTRAR PROFESSOR ADJUNTO NEM COM O CADASTRAR PROFESSOR TITULAR
        //EXEMPLO >> COLOCAR O CADASTRARTITULAR(TITULAR1)
        //EXEMPLO >> COLOCAR O CADASTRARTITULAR(TITULAR2)



    }




}
