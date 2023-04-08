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
    private int cdEstado;
    private String nmEstado;
    private String uf;
    private ArrayList<Cidade> cidade;

    public Estado() {
        this.cidade = new ArrayList<>();
    }

    public Estado(int cdEstado, String nmEstado, String uf, ArrayList<Cidade> cidade) {
        this.cdEstado = cdEstado;
        this.nmEstado = nmEstado;
        this.uf = uf;
        this.cidade = cidade;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public ArrayList<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(ArrayList<Cidade> cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Estado{" + "cdEstado=" + cdEstado + ", nmEstado=" + nmEstado + ""
                + ", uf=" + uf + ", cidade=" + cidade + '}';
    }
    
    
}
