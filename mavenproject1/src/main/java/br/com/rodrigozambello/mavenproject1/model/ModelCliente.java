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
public class ModelCliente {
  private int cdCliente;
  private String nmCliente;
  private String nrCpf;
  private ModelEndereco endereco;


    public ModelCliente() {
    }

    public ModelCliente(int cdCliente, String nmCliente, String nrCpf, ModelEndereco endereco) {
        this.cdCliente = cdCliente;
        this.nmCliente = nmCliente;
        this.nrCpf = nrCpf;
        this.endereco = endereco;
    }

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getNrCpf() {
        return nrCpf;
    }

    public void setNrCpf(String nrCpf) {
        this.nrCpf = nrCpf;
    }

    public ModelEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(ModelEndereco endereco) {
        this.endereco = endereco;
    }

    public void mostrarVenda(){

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cdCliente=" + cdCliente +
                ", nmCliente='" + nmCliente + '\'' +
                ", nrCpf='" + nrCpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
