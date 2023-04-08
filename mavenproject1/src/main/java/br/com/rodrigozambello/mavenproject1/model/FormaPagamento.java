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
    private String formaPagamento;

    public FormaPagamento() {
    }

    public FormaPagamento(int cdFormaPagamento, String formaPagamento) {
        this.cdFormaPagamento = cdFormaPagamento;
        this.formaPagamento = formaPagamento;
    }

    public int getCdFormaPagamento() {
        return cdFormaPagamento;
    }

    public void setCdFormaPagamento(int cdFormaPagamento) {
        this.cdFormaPagamento = cdFormaPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "cdFormaPagamento=" + cdFormaPagamento + ", formaPagamento=" + formaPagamento + '}';
    }
    
    
}
