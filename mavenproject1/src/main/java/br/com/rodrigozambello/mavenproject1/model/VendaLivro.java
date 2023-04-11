package br.com.rodrigozambello.mavenproject1.model;

public class VendaLivro {
    private int idVendaLivro;
    private Venda venda;
    private Livro livro;
    private int qtdVendaLivro;
    private double vlVendaLivro;

    public VendaLivro(int idVendaLivro, Venda venda, Livro livro, int qtdVendaLivro, double vlVendaLivro) {
        this.idVendaLivro = idVendaLivro;
        this.venda = venda;
        this.livro = livro;
        this.qtdVendaLivro = qtdVendaLivro;
        this.vlVendaLivro = vlVendaLivro;
    }

    public VendaLivro() {
    }

    public int getIdVendaLivro() {
        return idVendaLivro;
    }

    public void setIdVendaLivro(int idVendaLivro) {
        this.idVendaLivro = idVendaLivro;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Livro getLivro(){
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQtdVendaLivro() {
        return qtdVendaLivro;
    }

    public void setQtdVendaLivro(int qtdVendaLivro) {
        this.qtdVendaLivro = qtdVendaLivro;
    }

    public double getVlVendaLivro() {
        return vlVendaLivro;
    }

    public void setVlVendaLivro(double vlVendaLivro) {
        this.vlVendaLivro = vlVendaLivro;
    }

    @Override
    public String toString() {
        return "VendaLivro{" +
                "idVendaLivro=" + idVendaLivro +
                ", venda=" + venda +
                ", livro=" + livro +
                ", qtdVendaLivro=" + qtdVendaLivro +
                ", vlVendaLivro=" + vlVendaLivro +
                '}';
    }
}
