/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rodrigozambello.mavenproject1.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class ModelVenda {
    private int cdVenda;
    private ModelCliente cliente;
    private ArrayList<ModelLivro> listaLivro;
    private ArrayList<ModelVendaLivro> listaVendaLivro;
    private ModelFormaPagamento formaPagamento;
    private double vlTotal;

    public ModelVenda() {
        this.listaLivro = new ArrayList<>();
        this.listaVendaLivro = new ArrayList<>();
    }

    public ModelVenda(int cdVenda, ModelCliente cliente, ArrayList<ModelLivro> listaLivro, ModelFormaPagamento formaPagamento, double vlTotal) {
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

    public ModelCliente getCliente() {
        return cliente;
    }

    public void setCliente(ModelCliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ModelLivro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(ArrayList<ModelLivro> listaLivro) {
        this.listaLivro = listaLivro;
    }

    public ModelFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ModelFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        DecimalFormat vlTotalFormatado = new DecimalFormat("#.##");
        String formatei = vlTotalFormatado.format(vlTotal);
        this.vlTotal = Double.parseDouble(formatei.replace(',', '.'));
        
    }
    
    public ArrayList<ModelVendaLivro> getListaVendaLivro() {
        return listaVendaLivro;
    }

    public void setListaVendaLivro(ArrayList<ModelVendaLivro> listaVendaLivro) {
        this.listaVendaLivro = listaVendaLivro;
    }

    public String retornaNota(){
        String auxiliar = "";
        for(int i = 0; i < listaLivro.size(); i++){
            auxiliar =  auxiliar + (listaLivro.get(i).getNmLivro() +
                        " - Vl Unit: "+listaLivro.get(i).getPrecoVenda() +
                        " - Quantidade: " + listaVendaLivro.get(i).getQtdVendaLivro()+
                        " - Desconto: " + listaVendaLivro.get(i).getVlDesconto()+"\n");
        }

        return " -- Venda --" +
                "\nN° Nota Fiscal = " + cdVenda +
                "\nForma de Pagamento = " + formaPagamento.getDsFormaPagamento() +
                "\nValor = R$" + vlTotal +
                "\nCliente = " + cliente.getNmCliente() +
                "\nLivros = " + auxiliar
                ;

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
