/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

/**
 *
 * @author rodrigo
 */
public class FormaPagamento {
    private int cdFormaPagamento;
    private String dsFormaPagamento;

    public FormaPagamento() {
    }

    public FormaPagamento(int cdFormaPagamento, String dsFormaPagamento) {
        this.cdFormaPagamento = cdFormaPagamento;
        this.dsFormaPagamento = dsFormaPagamento;
    }

    public int getCdFormaPagamento() {
        return cdFormaPagamento;
    }

    public void setCdFormaPagamento(int cdFormaPagamento) {
        this.cdFormaPagamento = cdFormaPagamento;
    }

    public String getDsFormaPagamento() {
        return dsFormaPagamento;
    }

    public void setDsFormaPagamento(String dsFormaPagamento) {
        this.dsFormaPagamento = dsFormaPagamento;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "cdFormaPagamento=" + cdFormaPagamento +
                ", dsFormaPagamento='" + dsFormaPagamento + '\'' +
                '}';
    }
}
