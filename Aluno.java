package br.com.digitalhouse;

public class Aluno {

    private String nome;
    private String sobreNome;
    private int codigoAluno;

    public Aluno(String nome, String sobreNome, int codigoAluno) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codigoAluno = codigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }


    @Override
    public boolean equals(Object ehAluno) {
        if (!(ehAluno instanceof Aluno)){
            return false;
        }

        if(((Aluno) ehAluno).getCodigoAluno() == this.getCodigoAluno()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "\t CODIGO ALUNO......: " + this.codigoAluno +
               "\n NOME ALUNO........: " + this.nome +
               "\n SOBRENOME ALUNO...: " + this.sobreNome;
    }
}
