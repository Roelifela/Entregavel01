package br.com.digitalhouse;

abstract class Professor {

    private String nomeProfessor;
    private String sobreNomeProfessor;
    private int tempoCasa;
    private int codigoProfessor;

    public Professor(String nomeProfessor, String sobreNomeProfessor, int tempoCasa, int codigoProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.sobreNomeProfessor = sobreNomeProfessor;
        this.tempoCasa = tempoCasa;
        this.codigoProfessor = codigoProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobreNomeProfessor() {
        return sobreNomeProfessor;
    }

    public void setSobreNomeProfessor(String sobreNomeProfessor) {
        this.sobreNomeProfessor = sobreNomeProfessor;
    }

    public int getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(int tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    @Override
    public boolean equals(Object mesmoProfessor) {
        if (!(mesmoProfessor instanceof Professor)) {
            return false;
        }

        if (((Professor) mesmoProfessor).getCodigoProfessor() == this.getCodigoProfessor()) {
            return true;
        } else {
            return false;
        }
    }







}
