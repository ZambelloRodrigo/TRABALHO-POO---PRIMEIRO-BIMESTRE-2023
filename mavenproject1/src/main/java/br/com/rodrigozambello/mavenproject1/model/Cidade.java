/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class Cidade {
    private int cdCidade;
    private String nmCidade;
    private Bairro bairro;

    public Cidade() {
    }

    public Cidade(int cdCidade, String nmCidade) {
        this.cdCidade = cdCidade;
        this.nmCidade = nmCidade;
        this.bairro = bairro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    
    
    public int getCdCidade() {
        return cdCidade;
    }

    public void setCdCidade(int cdCidade) {
        this.cdCidade = cdCidade;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    @Override
    public String toString() {
        return "Cidade{" + "cdCidade=" + cdCidade + ", nmCidade=" + nmCidade + '}';
    }
    
    
}
