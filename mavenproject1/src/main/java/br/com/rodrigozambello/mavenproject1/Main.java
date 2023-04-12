/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.rodrigozambello.mavenproject1;

import br.com.rodrigozambello.mavenproject1.model.*;

import javax.swing.*;

/**
 *
 * @author rodrigo
 */
public class Main {

    public static void main(String[] args) {
        Pais pais = new Pais(1, "Brasil");
        Estado estado = new Estado(pais, 1, "Parana","PR");
        Cidade cidade = new Cidade(estado, 1 ,"Toledo");
        Bairro bairro = new Bairro(cidade, 1 , "Santa Maria");
        Endereco endereco = new Endereco(bairro, 1, "Avenida Parigot", 255);

        //Endereco endereco2 = new Endereco(bairro, 2, "Rua Santa Maria", 152);

        Editora editora1 = new Editora(1, "Editora Luz do Luar", "45978986584", "luzdoluar@gmail.com");
        Editora editora2 = new Editora(2, "Editora Luz do Sol", "45978986584", "luzdoluar@gmail.com");
        Editora editora3 = new Editora(3, "Editora Sem Luz", "45978986584", "luzdoluar@gmail.com");

        Genero genero1 = new Genero(1, "Aventura");
        Genero genero2 = new Genero(2, "Comedia");
        Genero genero3 = new Genero(3, "Adulto");

        Autor autor1 = new Autor(1,"Jose de Abreu", "45998796585", "josedeabreuautor@gmail.com");
        Autor autor2 = new Autor(2, "Casemiro de Aparecida", "459878965358", "cazetv@gmail.com");
        Autor autor3 = new Autor(3, "Rodolfo da Escrita", "459878965358", "cazetv@gmail.com");
        Autor autor4 = new Autor(4, "Leozin da Hornet", "459878965358", "cazetv@gmail.com");
        Autor autor5 = new Autor(5, "Simas Turbo", "459878965358", "cazetv@gmail.com");

        Livro livro1 = new Livro();
        livro1.setCdLivro(1);
        livro1.setNmLivro("HarryPotter");
        livro1.setAnoLancamento("2020");
        livro1.setEditora(editora1);
        livro1.setGenero(genero1);
        livro1.setNrPaginas(300);
        livro1.setPrecoVenda(58.98);
        livro1.setQtdEstoque(200);
        livro1.getListaAutor().add(autor1);
        livro1.getListaAutor().add(autor2);

        Livro livro2 = new Livro();
        livro2.setCdLivro(2);
        livro2.setNmLivro("Senhor dos Aneis");
        livro2.setAnoLancamento("2008");
        livro2.setEditora(editora2);
        livro2.setGenero(genero2);
        livro2.setNrPaginas(500);
        livro2.setPrecoVenda(78.95);
        livro2.setQtdEstoque(100);
        livro2.getListaAutor().add(autor2);

        Livro livro3 = new Livro();
        livro3.setCdLivro(3);
        livro3.setNmLivro("Casa do Dragão");
        livro3.setAnoLancamento("2005");
        livro3.setEditora(editora3);
        livro3.setGenero(genero3);
        livro3.setNrPaginas(150);
        livro3.setPrecoVenda(25);
        livro3.setQtdEstoque(100);
        livro3.getListaAutor().add(autor3);

        FormaPagamento formaPagamento1 = new FormaPagamento(1, "Avista");
        FormaPagamento formaPagamento2 = new FormaPagamento(2, "Prazo");

        Cliente cliente1 = new Cliente();
        cliente1.setCdCliente(1);
        cliente1.setNmCliente("Boni Rustico");
        cliente1.setNrCpf("11145489");
        cliente1.setEndereco(endereco);

        Venda venda = new Venda();
        venda.setCliente(cliente1);
        venda.setCdVenda(1);
        venda.getListaLivro().add(livro1);
        venda.getListaLivro().add(livro2);
        venda.getListaLivro().add(livro3);

        VendaLivro vendaLivro1 = new VendaLivro(livro1, 10, 10);
        VendaLivro vendaLivro2 = new VendaLivro(livro2, 2, 5);
        VendaLivro vendaLivro3 = new VendaLivro(livro3, 5, 3);


        venda.setVlTotal((vendaLivro1.getVlVendaLivro() +
                          vendaLivro2.getVlVendaLivro() +
                          vendaLivro3.getVlVendaLivro()));

        String[] options = {"Opção 1 - Avista", "Opção 2 - Prazo"};
        int selectedOption = JOptionPane.showOptionDialog(null, "Total da conta: "+ venda.getVlTotal() + "\n" + "Deseja pagar de que forma: ", "Selecione a forma de pagamento", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if(selectedOption == 0){
            venda.setFormaPagamento(formaPagamento1);
        } else if (selectedOption == 1) {
            venda.setFormaPagamento(formaPagamento2);
        } else {
            JOptionPane.showMessageDialog(null, "Erro - Digite uma forma de pagamento válida.");
        }
        venda.getListaVendaLivro().add(vendaLivro1);
        venda.getListaVendaLivro().add(vendaLivro2);
        venda.getListaVendaLivro().add(vendaLivro3);
        System.out.println(venda.retornaNota());

        System.out.println(venda.toString());
    }
}
