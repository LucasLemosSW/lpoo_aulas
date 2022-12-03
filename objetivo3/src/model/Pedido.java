package model;

import java.util.Date;
import java.util.List;

public class Pedido {

    private int numero;
    private Date data;
    private double valor;

    List<Item> itens;
    List<Produto> produtos;

    Tipo estado = Tipo.PENDENTE;

    public boolean manterPedido(int numero){ return true;}

    public boolean manterItem(int codItem){
        return true;
    }

    public Pedido(int numero, Date data, double valor, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.itens = itens;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", itens=" + itens +
                ", estado=" + estado +
                '}';
    }
}
