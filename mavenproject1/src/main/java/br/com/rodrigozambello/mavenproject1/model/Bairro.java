/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class Bairro {
    private int cdBairro;
    private String nmBairro;

    public Bairro() {
    }

    public Bairro(int cdBairro, String nmBairro) {
        this.cdBairro = cdBairro;
        this.nmBairro = nmBairro;
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
        return "Bairro{" + "cdBairro=" + cdBairro + ", nmBairro=" + nmBairro + '}';
    }
    
    
}
