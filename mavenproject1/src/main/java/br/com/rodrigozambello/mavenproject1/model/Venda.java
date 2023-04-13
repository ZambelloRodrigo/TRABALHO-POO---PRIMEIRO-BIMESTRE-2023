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
    private ArrayList<VendaLivro> listaVendaLivro;
    private FormaPagamento formaPagamento;
    private double vlTotal;

    public Venda() {
        this.listaLivro = new ArrayList<>();
        this.listaVendaLivro = new ArrayList<>();
        
    }

    public Venda(int cdVenda, Cliente cliente, ArrayList<Livro> listaLivro, FormaPagamento formaPagamento, double vlTotal) {
        this.cdVenda = cdVenda;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.vlTotal = vlTotal;
        this.listaLivro = new ArrayList<>();
        validaEndereco();
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
        if(this.cliente.getEndereco() == null){
            validaEndereco();
        }
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

    public ArrayList<VendaLivro> getListaVendaLivro() {
        return listaVendaLivro;
    }

    public void setListaVendaLivro(ArrayList<VendaLivro> listaVendaLivro) {
        this.listaVendaLivro = listaVendaLivro;
    }

    private void validaEndereco(){
        System.out.println("Favor Cadastrar o Endereco do Cliente");
        System.exit(0);

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
                "\nLivros =" + auxiliar
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
