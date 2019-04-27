package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private int codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int numeroMaximoAluno;
    List<Aluno> alunoList;


    public Curso(String nomeCurso, int codigoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, int numeroMaximoAluno, List<Aluno> alunoList) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.numeroMaximoAluno = numeroMaximoAluno;
        this.alunoList = alunoList;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getNumeroMaximoAluno() {
        return numeroMaximoAluno;
    }

    public void setNumeroMaximoAluno(int numeroMaximoAluno) {
        this.numeroMaximoAluno = numeroMaximoAluno;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public boolean adicionarUmAluno(Aluno aluno){
        if(alunoList.size() >= this.getNumeroMaximoAluno()){
            return false;
        }else{
            return true;
        }
    }



    @Override
    public boolean equals(Object mesmoCurso) {
        if (!(mesmoCurso instanceof Curso)) {
            return false;
        }

        if (((Curso) mesmoCurso).getCodigoCurso() == this.getCodigoCurso()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\t CODIGO CURSO......: " + this.codigoCurso +
               "\n NOME CURSO........: " + this.nomeCurso;
    }
}
