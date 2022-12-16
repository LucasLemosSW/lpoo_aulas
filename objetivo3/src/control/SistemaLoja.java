package control;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SistemaLoja {
    public static void main(String[] args) {



        Vendedor vendedor1 = new Vendedor(001,"Sergio","Frontino Vieira","Fragata",
                "96040700","Pelotas","RS","Loja_Centro");

        Fornecedor fornecedor_A = new Fornecedor(5846,"9482154","Rener");

        Produto camisa = new Produto(1,"camisa",10,100,fornecedor_A);
        Produto calca = new Produto(2,"calca",50,200,fornecedor_A);

        List<Produto> produtos= new ArrayList<>();
        produtos.add(camisa);
        produtos.add(calca);

        Fornecimento fornecimento_1 = new Fornecimento(new Date(), camisa.getPreco()* camisa.getQuantidade(), fornecedor_A,camisa);
        Fornecimento fornecimento_2 = new Fornecimento(new Date(), calca.getPreco() * calca.getQuantidade() , fornecedor_A,calca);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento_1);
        fornecimentos.add(fornecimento_2);

        // VENDA 1
        Item item_1= new Item(camisa.getCodigo(), 0,6,camisa);
        Item item_2= new Item(calca.getCodigo(), 0,1,calca);

        List<Item> itens_venda_1 = new ArrayList<>();
        itens_venda_1.add(item_1);
        itens_venda_1.add(item_2);

//        itens_venda_1.stream().forEach(item -> System.out.println("\nquantidade item: "+item.getQuantidade() + "\nquantidade estoque: "));
        if(vendedor1.realizarPedido(itens_venda_1))
            System.out.println("\nVenda realizada !!!");
        else
            mythrowException();

//        mythrowException();

        // VENDA 2
        item_1= new Item(calca.getCodigo(), 0,3,camisa);
        item_2= new Item(calca.getCodigo(), 0,10,calca);

        List<Item> itens_venda2 = new ArrayList<>();
        itens_venda2.add(item_1);
        itens_venda2.add(item_2);

        if( vendedor1.realizarPedido(itens_venda2))
            System.out.println("\nVenda realizada !!!");
        else
            mythrowException();

        // VENDA 3 COM lançamento de exception
        item_1= new Item(camisa.getCodigo(), 0,5,camisa);

        List<Item> itens_venda3 = new ArrayList<>();
        itens_venda3.add(item_1);

        if( vendedor1.realizarPedido(itens_venda3))
            System.out.println("\nVenda realizada !!!");
        else
            mythrowException();


        System.out.println("\nVendedor" +vendedor1);

        System.out.println("\nProdutos em estoque: " + produtos);

    }

    private static void mythrowException() {
        try { //try-catch é um único comando, deve vir juntos
            throw new EstoqueInsuficienteException(); // gera a exceção
        } catch (EstoqueInsuficienteException e) { // pega a exceção lançada no bloco try
            e.printStackTrace(); //imprime a stack de exceção
        } finally { // executa em qualquer caso, seja resultado da execução do try ou do catch
            System.err.println("Finally executado em mythrowException()");
        }
    }

}