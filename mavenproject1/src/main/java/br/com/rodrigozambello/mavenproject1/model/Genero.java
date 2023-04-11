/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class Genero {
    private int cdGenero;
    private String dsGenero;

    public Genero() {
    }

    public Genero(int cdGenero, String dsGenero) {
        this.cdGenero = cdGenero;
        this.dsGenero = dsGenero;
    }

    public int getCdGenero() {
        return cdGenero;
    }

    public void setCdGenero(int cdGenero) {
        this.cdGenero = cdGenero;
    }

    public String getDsGenero() {
        return dsGenero;
    }

    public void setDsGenero(String dsGenero) {
        this.dsGenero = dsGenero;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "cdGenero=" + cdGenero +
                ", dsGenero='" + dsGenero + '\'' +
                '}';
    }
}
