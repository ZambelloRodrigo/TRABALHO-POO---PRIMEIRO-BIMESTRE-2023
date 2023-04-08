/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class Autor {
    private int cdAutor;
    private String nmAutor;

    public Autor() {
    }

    public Autor(int cdAutor, String nmAutor) {
        this.cdAutor = cdAutor;
        this.nmAutor = nmAutor;
    }

    public int getCdAutor() {
        return cdAutor;
    }

    public void setCdAutor(int cdAutor) {
        this.cdAutor = cdAutor;
    }

    public String getNmAutor() {
        return nmAutor;
    }

    public void setNmAutor(String nmAutor) {
        this.nmAutor = nmAutor;
    }

    @Override
    public String toString() {
        return "Autor{" + "cdAutor=" + cdAutor + ", nmAutor=" + nmAutor + '}';
    }
    
    
}
