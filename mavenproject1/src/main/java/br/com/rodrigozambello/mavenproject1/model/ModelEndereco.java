/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class ModelEndereco {
    private ModelBairro bairro;
    private int cdEndereco;
    private String nmRua;
    private int nrRua;

    public ModelEndereco() {
    }

    public ModelEndereco(ModelBairro bairro, int cdEndereco, String nmRua, int nrRua) {
        this.bairro = bairro;
        this.cdEndereco = cdEndereco;
        this.nmRua = nmRua;
        this.nrRua = nrRua;
    }

    public ModelBairro getBairro() {
        return bairro;
    }

    public void setBairro(ModelBairro bairro) {
        this.bairro = bairro;
    }

    public int getCdEndereco() {
        return cdEndereco;
    }

    public void setCdEndereco(int cdEndereco) {
        this.cdEndereco = cdEndereco;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public int getNrRua() {
        return nrRua;
    }

    public void setNrRua(int nrRua) {
        this.nrRua = nrRua;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro=" + bairro +
                ", cdEndereco=" + cdEndereco +
                ", nmRua='" + nmRua + '\'' +
                ", nrRua=" + nrRua +
                '}';
    }
}
