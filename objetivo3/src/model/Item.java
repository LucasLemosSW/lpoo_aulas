package model;

public class Item {

    private int codItem;
    private double desconto;
    private double quantidade;

    Produto produto;

    public Item(int codItem, double desconto, double quantidade, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
