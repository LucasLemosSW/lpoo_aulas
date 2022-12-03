package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    Fornecedor fornecedor;

    public boolean manterProduto(int codigo,int vendidos){
        this.quantidade-=vendidos;
        return true;
    }

    public Produto(int codigo, String nome, int quantidade, double preco, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ",\nfornecedor=" + fornecedor +
                '}';
    }


}
