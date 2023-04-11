package br.com.rodrigozambello.mavenproject1.model;

public class Bairro {
    private Cidade cidade;
    private int cdBairro;
    private String nmBairro;

    public Bairro() {
    }

    public Bairro(Cidade cidade, int cdBairro, String nmBairro) {
        this.cidade = cidade;
        this.cdBairro = cdBairro;
        this.nmBairro = nmBairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getCdBairro() {
        return cdBairro;
    }

    public void setCdBairro(int cdBairro) {
        this.cdBairro = cdBairro;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }
    @Override
    public String toString() {
        return "Bairro{" +
                "cidade=" + cidade +
                ", cdBairro=" + cdBairro +
                ", nmBairro='" + nmBairro + '\'' +
                '}';
    }
}
