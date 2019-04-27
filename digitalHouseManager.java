package br.com.digitalhouse;

import java.util.List;

public class digitalHouseManager {

    private List<Aluno> alunoList;
    private List<Professor> professorList;
    private List<Curso> cursoList;
    private List<Matricula> matriculaList;

    public digitalHouseManager(List<Aluno> alunoList, List<Professor> professorList, List<Curso> cursoList, List<Matricula> matriculaList) {
        this.alunoList = alunoList;
        this.professorList = professorList;
        this.cursoList = cursoList;
        this.matriculaList = matriculaList;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }



}
