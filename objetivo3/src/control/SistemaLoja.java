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

        Produto camisa = new Produto(1,"camisa",100,100,fornecedor_A);
        Produto calca = new Produto(2,"calca",50,200,fornecedor_A);

        List<Produto> produtos= new ArrayList<>();
        produtos.add(camisa);
        produtos.add(calca);

        Fornecimento fornecimento_1 = new Fornecimento(new Date(),50000,fornecedor_A,camisa);
        Fornecimento fornecimento_2 = new Fornecimento(new Date(),100000,fornecedor_A,calca);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento_1);
        fornecimentos.add(fornecimento_2);

        System.out.println("\nForncedimentos:");
        System.out.println(fornecimentos);

        System.out.println("\nVendas:");

        Item item_1= new Item(1,0,5,camisa);
        Item item_2= new Item(2,0,1,calca);

        List<Item> itens = new ArrayList<>();
        itens.add(item_1);
        itens.add(item_2);

        vendedor1.realizarPedido(itens,300);

        System.out.println(vendedor1);

        System.out.println(produtos);






    }
}