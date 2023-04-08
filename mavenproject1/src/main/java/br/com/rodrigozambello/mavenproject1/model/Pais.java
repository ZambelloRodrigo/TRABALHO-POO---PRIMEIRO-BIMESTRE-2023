/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class Pais {
    private int cdPais;
    private String nmPais;
    private Estado estado;

    public Pais() {
    }

    public Pais(int cdPais, String nmPais, Estado estado) {
        this.cdPais = cdPais;
        this.nmPais = nmPais;
        this.estado = estado;
    }

    public int getCdPais() {
        return cdPais;
    }

    public void setCdPais(int cdPais) {
        this.cdPais = cdPais;
    }

    public String getNmPais() {
        return nmPais;
    }

    public void setNmPais(String nmPais) {
        this.nmPais = nmPais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pais{" + "cdPais=" + cdPais + ", nmPais=" + nmPais + ", estado=" + estado + '}';
    }
    
    
}
