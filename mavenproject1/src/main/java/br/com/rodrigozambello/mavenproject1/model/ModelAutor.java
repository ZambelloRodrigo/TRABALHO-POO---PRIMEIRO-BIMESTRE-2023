/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class ModelAutor {
    private int cdAutor;
    private String nmAutor;
    private String nrTelefone;
    private String email;

    public ModelAutor() {
    }

    public ModelAutor(int cdAutor, String nmAutor, String nrTelefone, String email) {
        this.cdAutor = cdAutor;
        this.nmAutor = nmAutor;
        this.nrTelefone = nrTelefone;
        this.email = email;
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

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "cdAutor=" + cdAutor +
                ", nmAutor='" + nmAutor + '\'' +
                ", nrTelefone='" + nrTelefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
