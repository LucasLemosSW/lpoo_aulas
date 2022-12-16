package model;

import java.util.Date;
import java.util.List;

public class Pedido {

    private int numero;
    private Date data;
    private double valor;

    Vendedor vendedorPedido;

    List<Item> itens;

    Tipo estado = Tipo.PENDENTE;

    public boolean manterPedido(int numero){ return true;}

    public boolean manterItem(int codItem){
        return true;
    }

    public Pedido(int numero, Date data, double valor, List<Item> itens,Vendedor vendedorPedido) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.itens = itens;
        this.vendedorPedido = vendedorPedido;
    }

    public void setEstado(Tipo estado) {
        this.estado = estado;
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
