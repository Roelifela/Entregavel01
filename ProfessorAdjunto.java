package br.com.digitalhouse;


public class ProfessorAdjunto extends Professor{

    private String especialidade;


    public ProfessorAdjunto(String nomeProfessor, String sobreNomeProfessor, int tempoCasa, int codigoProfessor, String especialidade, int horaMonitoria) {
        super(nomeProfessor, sobreNomeProfessor, tempoCasa, codigoProfessor);
        this.especialidade = especialidade;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}