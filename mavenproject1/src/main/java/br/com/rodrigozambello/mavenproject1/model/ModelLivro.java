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
public class ModelLivro {
    private int cdLivro;
    private String nmLivro;
    private ModelEditora editora;
    private ArrayList<ModelAutor>listaAutor;
    private String anoLancamento;
    private ModelGenero genero;
    private int nrPaginas;
    private double qtdEstoque;
    private double precoVenda;

    public ModelLivro() {
        this.listaAutor = new ArrayList<>();
    }

    public ModelLivro(int cdLivro, ModelEditora editora, ArrayList<ModelAutor> listaAutor, String anoLancamento, ModelGenero genero, int nrPaginas, double qtdEstoque, double precoVenda, String nmLivro) {
        this.cdLivro = cdLivro;
        this.editora = editora;
        this.listaAutor = listaAutor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.nrPaginas = nrPaginas;
        this.qtdEstoque = qtdEstoque;
        this.precoVenda = precoVenda;
        this.nmLivro = nmLivro;
        this.listaAutor = new ArrayList<>();
    }

    public String getNmLivro() {
        return nmLivro;
    }

    public void setNmLivro(String nmLivro) {
        this.nmLivro = nmLivro;
    }

    public int getCdLivro() {
        return cdLivro;
    }

    public void setCdLivro(int cdLivro) {
        this.cdLivro = cdLivro;
    }

    public ModelEditora getEditora() {
        return editora;
    }

    public void setEditora(ModelEditora editora) {
        this.editora = editora;
    }

    public ArrayList<ModelAutor> getListaAutor() {
        return listaAutor;
    }

    public void setListaAutor(ArrayList<ModelAutor> listaAutor) {
        this.listaAutor = listaAutor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public ModelGenero getGenero() {
        return genero;
    }

    public void setGenero(ModelGenero genero) {
        this.genero = genero;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public double getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "cdLivro=" + cdLivro +
                ", nmLivro=" + nmLivro +
                ", editora=" + editora +
                ", listaAutor=" + listaAutor +
                ", anoLancamento='" + anoLancamento + '\'' +
                ", genero=" + genero +
                ", nrPaginas=" + nrPaginas +
                ", qtdEstoque=" + qtdEstoque +
                ", precoVenda=" + precoVenda +
                '}';
    }
}
