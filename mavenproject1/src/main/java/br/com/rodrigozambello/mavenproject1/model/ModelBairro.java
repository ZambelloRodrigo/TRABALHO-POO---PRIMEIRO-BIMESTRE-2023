package br.com.rodrigozambello.mavenproject1.model;

public class ModelBairro {
    private ModelCidade cidade;
    private int cdBairro;
    private String nmBairro;

    public ModelBairro() {
    }

    public ModelBairro(ModelCidade cidade, int cdBairro, String nmBairro) {
        this.cidade = cidade;
        this.cdBairro = cdBairro;
        this.nmBairro = nmBairro;
    }

    public ModelCidade getCidade() {
        return cidade;
    }

    public void setCidade(ModelCidade cidade) {
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
