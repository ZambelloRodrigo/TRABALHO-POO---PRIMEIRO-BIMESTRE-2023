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

    public Pais() {
    }
    public Pais(int cdPais, String nmPais) {
        this.cdPais = cdPais;
        this.nmPais = nmPais;
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

    @Override
    public String toString() {
        return "Pais{" +
                "cdPais=" + cdPais +
                ", nmPais=" + nmPais +
                '}';
    }
}
