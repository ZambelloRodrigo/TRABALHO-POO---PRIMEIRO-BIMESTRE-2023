package br.com.rodrigozambello.mavenproject1.model;

public class VendaLivro {
    private Livro livro;
    private int qtdVendaLivro;
    private double vlVendaLivro;
    private double vlDesconto;

    public VendaLivro() {
    }

    public VendaLivro(Livro livro, int qtdVendaLivro, double vlDesconto) {
        this.livro = livro;
        this.qtdVendaLivro = qtdVendaLivro;
        this.vlDesconto = vlDesconto;
        calculaVlLiquido();
    }

    public Livro getLivro() {
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

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    private void calculaVlLiquido(){
        double auxiliar;
        auxiliar = livro.getPrecoVenda() * this.qtdVendaLivro;
        this.vlVendaLivro = auxiliar - vlDesconto;
        calculaEstoque();
    }
    private void calculaEstoque(){
        double auxiliar;
        auxiliar = livro.getQtdEstoque() - this.qtdVendaLivro;
        livro.setQtdEstoque(auxiliar);
    }

    @Override
    public String toString() {
        return "VendaLivro{" +
                "livro=" + livro +
                ", qtdVendaLivro=" + qtdVendaLivro +
                ", vlVendaLivro=" + vlVendaLivro +
                ", vlDesconto=" + vlDesconto +
                '}';
    }
}

