/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class Estado {
    private Pais pais;
    private int cdEstado;
    private String nmEstado;
    private String siglaUf;

    public Estado() {
    }

    public Estado(Pais pais, int cdEstado, String nmEstado, String siglaUf) {
        this.pais = pais;
        this.cdEstado = cdEstado;
        this.nmEstado = nmEstado;
        this.siglaUf = siglaUf;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getCdEstado() {
        return cdEstado;
    }

    public void setCdEstado(int cdEstado) {
        this.cdEstado = cdEstado;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "pais=" + pais +
                ", cdEstado=" + cdEstado +
                ", nmEstado='" + nmEstado + '\'' +
                ", siglaUf='" + siglaUf + '\'' +
                '}';
    }
}
