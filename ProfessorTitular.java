package br.com.digitalhouse;

public class ProfessorTitular extends Professor{

    private int horaMonitoria;

    public ProfessorTitular(String nomeProfessor, String sobreNomeProfessor, int tempoCasa, int codigoProfessor, int horaMonitoria) {
        super(nomeProfessor, sobreNomeProfessor, tempoCasa, codigoProfessor);
        this.horaMonitoria = horaMonitoria;
    }

    public int getHoraMonitoria() {
        return horaMonitoria;
    }

    public void setHoraMonitoria(int horaMonitoria) {
        this.horaMonitoria = horaMonitoria;
    }
}
