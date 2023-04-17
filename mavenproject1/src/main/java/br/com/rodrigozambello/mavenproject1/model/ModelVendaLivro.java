package br.com.rodrigozambello.mavenproject1.model;

public class ModelVendaLivro {
    private ModelLivro livro;
    private int qtdVendaLivro;
    private double vlVendaLivro;
    private double vlDesconto;

    public ModelVendaLivro() {
    }

    public ModelVendaLivro(ModelLivro livro, int qtdVendaLivro, double vlDesconto) {
        this.livro = livro;
        this.qtdVendaLivro = qtdVendaLivro;
        this.vlDesconto = vlDesconto;
         calculaVlLiquido();
    }

    public ModelLivro getLivro() {
        return livro;
    }

    public void setLivro(ModelLivro livro) {

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
    if (vlDesconto < 0) {
        System.out.println("O valor de desconto não pode ser negativo, não será aplicado desconto");
        this.vlDesconto = 0;
    } else {
        this.vlDesconto = vlDesconto;
    }
    
    calculaVlLiquido();
}

    private void calculaVlLiquido(){
        double auxiliar;
        auxiliar = livro.getPrecoVenda() * this.qtdVendaLivro;
        this.vlVendaLivro = auxiliar - getVlDesconto();
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

