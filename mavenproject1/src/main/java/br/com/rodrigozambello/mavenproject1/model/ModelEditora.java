/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class ModelEditora {
    private int cdEditora;
    private String nmEditora;
    private String nrTelefone;
    private String email;

    public ModelEditora() {
    }

    public ModelEditora(int cdEditora, String nmEditora, String nrTelefone, String email) {
        this.cdEditora = cdEditora;
        this.nmEditora = nmEditora;
        this.nrTelefone = nrTelefone;
        this.email = email;
    }

    public int getCdEditora() {
        return cdEditora;
    }

    public void setCdEditora(int cdEditora) {
        this.cdEditora = cdEditora;
    }

    public String getNmEditora() {
        return nmEditora;
    }

    public void setNmEditora(String nmEditora) {
        this.nmEditora = nmEditora;
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
        return "Editora{" +
                "cdEditora=" + cdEditora +
                ", nmEditora='" + nmEditora + '\'' +
                ", nrTelefone='" + nrTelefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
