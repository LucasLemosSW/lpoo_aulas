package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vendedor extends Funcionario{

    private String local;

    List<Pedido> pedidos = new ArrayList<>();

    public void realizarPedido(List<Item> itens,double valor){

        Date data = new Date();
        Pedido pedido1 = new Pedido(1,data,150,itens);
        pedidos.add(pedido1);

        // baixa estoque
//        System.out.println("baixa estoque");
//        pedido1.itens.forEach(item -> System.out.println(item.produto.getQuantidade()));

        pedido1.itens.forEach(item-> item.produto.setQuantidade(item.produto.getQuantidade()-(int) item.getQuantidade()));

//        pedido1.itens.forEach(item -> System.out.println(item.produto.getQuantidade()));

        //Altera estado do pedido
        pedido1.setEstado(Tipo.ATENDIDO);


    }

    public void consultarPreco(){ }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "local='" + local + '\'' +
                "} " + super.toString() +
                ", pedidos=" + pedidos;
    }
}
