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
    private int cdEndereco;
    private String nmRua;
    private int nrCasa;
    private int cep;
    private Bairro bairro;
    private Cidade cidade;
    private Estado estado;
    private Pais pais;

    public Endereco() {
    }

    public Endereco(int cdEndereco, String nmRua, int nrCasa, int cep, Bairro bairro, Cidade cidade, Estado estado, Pais pais) {
        this.cdEndereco = cdEndereco;
        this.nmRua = nmRua;
        this.nrCasa = nrCasa;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
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

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cdEndereco=" + cdEndereco + ", nmRua=" + nmRua + ", nrCasa=" + nrCasa + ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + '}';
    }
    
}
