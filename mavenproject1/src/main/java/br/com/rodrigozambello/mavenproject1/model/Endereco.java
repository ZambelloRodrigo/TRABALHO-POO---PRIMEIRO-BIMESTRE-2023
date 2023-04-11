/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class Endereco {
    private Bairro bairro;
    private int cdEndereco;
    private String nmRua;
    private String nmBairro;
    private int nrRua;

    public Endereco() {
    }

    public Endereco(Bairro bairro, int cdEndereco, String nmRua, String nmBairro, int nrRua) {
        this.bairro = bairro;
        this.cdEndereco = cdEndereco;
        this.nmRua = nmRua;
        this.nmBairro = nmBairro;
        this.nrRua = nrRua;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
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

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
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
                ", nmBairro='" + nmBairro + '\'' +
                ", nrRua=" + nrRua +
                '}';
    }
}
