/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class ModelCidade {

    private ModelEstado estado;
    private int cdCidade;
    private String nmCidade;

    public ModelCidade() {
    }

    public ModelCidade(ModelEstado estado, int cdCidade, String nmCidade) {
        this.estado = estado;
        this.cdCidade = cdCidade;
        this.nmCidade = nmCidade;
    }

    public ModelEstado getEstado() {
        return estado;
    }

    public void setEstado(ModelEstado estado) {
        this.estado = estado;
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
        return "Cidade{" +
                "estado=" + estado +
                ", cdCidade=" + cdCidade +
                ", nmCidade='" + nmCidade + '\'' +
                '}';
    }
}
