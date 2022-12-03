package model;

import java.util.Date;

public class Fornecimento {
    private Date data;
    private double valorTotal;

    Fornecedor fornecedor;
    Produto produto;

    public Fornecimento(Date data, double valorTotal,Fornecedor fornecedor,Produto produto) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
