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
public class Venda {
    private int cdVenda;
    private Cliente cliente;
    private ArrayList<Livro> listaLivro;
    private FormaPagamento formaPagamento;
    private double vlTotal;

    public Venda() {
        this.listaLivro = new ArrayList<>();
    }

    public Venda(int cdVenda, Cliente cliente, ArrayList<Livro> listaLivro, FormaPagamento formaPagamento, double vlTotal) {
        this.cdVenda = cdVenda;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.vlTotal = vlTotal;
        this.listaLivro = new ArrayList<>();
    }

    public int getCdVenda() {
        return cdVenda;
    }

    public void setCdVenda(int cdVenda) {
        this.cdVenda = cdVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Livro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(ArrayList<Livro> listaLivro) {
        this.listaLivro = listaLivro;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }
    

    @Override
    public String toString() {
        return "Venda{" +
                "cdVenda=" + cdVenda +
                ", cliente=" + cliente +
                ", listaLivro=" + listaLivro +
                ", formaPagamento=" + formaPagamento +
                ", vlTotal=" + vlTotal +
                '}';
    }
}
