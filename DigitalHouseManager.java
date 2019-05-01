package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> alunoList = new ArrayList<>();
    private List<Professor> professorList = new ArrayList<>();
    private List<Curso> cursoList = new ArrayList<>();
    private List<Matricula> matriculaList = new ArrayList<>();

    public DigitalHouseManager(List<Aluno> alunoList, List<Professor> professorList, List<Curso> cursoList, List<Matricula> matriculaList) {
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

    public void registrarCurso(String nome, Integer codigoCurso,
                               Integer quantidadeMaximaDeAlunos){

        //PERGUNTAR COMO INSERIR O CODIGO

    }

    public void matricularAluno(Integer codigoAluno, Integer
            codigoCurso){

        //PERGUNTAR COMO INSERIR O CODIGO

    }

    public void alocarProfessores(Integer codigoCurso, Integer
            codigoProfessorTitular, Integer codigoProfessorAdjunto){

        //PERGUNTAR COMO INSERIR O CODIGO

    }

    public void cadastrarTitular(ProfessorTitular titular){
        this.professorList.add(titular);
    }

    public void cadastrarAdjunto(ProfessorAdjunto adjunto){
        this.professorList.add(adjunto);
    }








}
