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
        ModelPais pais = new ModelPais(1, "Brasil");
        ModelEstado estado = new ModelEstado(pais, 1, "Parana","PR");
        ModelCidade cidade = new ModelCidade(estado, 1 ,"Toledo");
        ModelBairro bairro = new ModelBairro(cidade, 1 , "Santa Maria");
        ModelEndereco endereco = new ModelEndereco(bairro, 1, "Avenida Parigot", 255);

        //Endereco endereco2 = new ModelEndereco(bairro, 2, "Rua Santa Maria", 152);

        ModelEditora editora1 = new ModelEditora(1, "Editora Luz do Luar", "45978986584", "luzdoluar@gmail.com");
        ModelEditora editora2 = new ModelEditora(2, "Editora Luz do Sol", "45978986584", "luzdoluar@gmail.com");
        ModelEditora editora3 = new ModelEditora(3, "Editora Sem Luz", "45978986584", "luzdoluar@gmail.com");

        ModelGenero genero1 = new ModelGenero(1, "Aventura");
        ModelGenero genero2 = new ModelGenero(2, "Comedia");
        ModelGenero genero3 = new ModelGenero(3, "Adulto");

        ModelAutor autor1 = new ModelAutor(1,"Jose de Abreu", "45998796585", "josedeabreuautor@gmail.com");
        ModelAutor autor2 = new ModelAutor(2, "Casemiro de Aparecida", "459878965358", "cazetv@gmail.com");
        ModelAutor autor3 = new ModelAutor(3, "Rodolfo da Escrita", "459878965358", "cazetv@gmail.com");
        ModelAutor autor4 = new ModelAutor(4, "Leozin da Hornet", "459878965358", "cazetv@gmail.com");
        ModelAutor autor5 = new ModelAutor(5, "Simas Turbo", "459878965358", "cazetv@gmail.com");

        ModelLivro livro1 = new ModelLivro();
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

        ModelLivro livro2 = new ModelLivro();
        livro2.setCdLivro(2);
        livro2.setNmLivro("Senhor dos Aneis");
        livro2.setAnoLancamento("2008");
        livro2.setEditora(editora2);
        livro2.setGenero(genero2);
        livro2.setNrPaginas(500);
        livro2.setPrecoVenda(78.95);
        livro2.setQtdEstoque(100);
        livro2.getListaAutor().add(autor2);

        ModelLivro livro3 = new ModelLivro();
        livro3.setCdLivro(3);
        livro3.setNmLivro("Casa do Dragão");
        livro3.setAnoLancamento("2005");
        livro3.setEditora(editora3);
        livro3.setGenero(genero3);
        livro3.setNrPaginas(150);
        livro3.setPrecoVenda(25);
        livro3.setQtdEstoque(100);
        livro3.getListaAutor().add(autor3);

        ModelFormaPagamento formaPagamento1 = new ModelFormaPagamento(1, "Avista");
        ModelFormaPagamento formaPagamento2 = new ModelFormaPagamento(2, "Prazo");

        ModelCliente cliente1 = new ModelCliente();
        cliente1.setCdCliente(1);
        cliente1.setNmCliente("Boni Rustico");
        cliente1.setNrCpf("11145489");
        cliente1.setEndereco(endereco);

        ModelVenda venda = new ModelVenda();
        venda.setCliente(cliente1);
        venda.setCdVenda(1);
        venda.getListaLivro().add(livro1);
        venda.getListaLivro().add(livro2);
        venda.getListaLivro().add(livro3);

        try {
            
        ModelVendaLivro vendaLivro1 = new ModelVendaLivro(livro1, 10, 10);
        ModelVendaLivro vendaLivro2 = new ModelVendaLivro(livro2, 2,-10);
        ModelVendaLivro vendaLivro3 = new ModelVendaLivro(livro3, 5, 3);
            
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
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
