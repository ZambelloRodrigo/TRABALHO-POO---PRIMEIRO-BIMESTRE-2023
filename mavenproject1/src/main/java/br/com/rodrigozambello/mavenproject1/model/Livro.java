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
public class Livro {
    private int cdLivro;
    private Editora editora;
    private ArrayList<Autor>listaAutor;
    private String anoLancamento;
    private Genero genero;
    private int nrPaginas;
    private double qtdEstoque;
    private double precoVenda;

    public Livro() {
        this.listaAutor = new ArrayList<>();
    }

    public Livro(int cdLivro, Editora editora, ArrayList<Autor> listaAutor, String anoLancamento, Genero genero, int nrPaginas, double qtdEstoque, double precoVenda) {
        this.cdLivro = cdLivro;
        this.editora = editora;
        this.listaAutor = listaAutor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.nrPaginas = nrPaginas;
        this.qtdEstoque = qtdEstoque;
        this.precoVenda = precoVenda;
        this.listaAutor = new ArrayList<>();
    }

    public int getCdLivro() {
        return cdLivro;
    }

    public void setCdLivro(int cdLivro) {
        this.cdLivro = cdLivro;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public ArrayList<Autor> getListaAutor() {
        return listaAutor;
    }

    public void setListaAutor(ArrayList<Autor> listaAutor) {
        this.listaAutor = listaAutor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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
