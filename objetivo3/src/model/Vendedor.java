package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vendedor extends Funcionario{

    private String local;

    List<Pedido> pedidos = new ArrayList<>();

    public boolean realizarPedido(List<Item> itens){

        for (int i=0;i< itens.size();i++){
            if(itens.stream().toList().get(i).produto.getQuantidade()<itens.stream().toList().get(i).getQuantidade())
                return false;
        }

        double valor = itens.stream() //1
                .mapToDouble(i -> i.getQuantidade() * i.produto.getPreco()) //2
                .sum();

        Date data = new Date();
        Pedido pedido = new Pedido(data,valor,itens,this);
        pedidos.add(pedido);

        // baixa estoque
//        System.out.println("baixa estoque");
//        pedido1.itens.forEach(item -> System.out.println(item.produto.getQuantidade()));

        pedido.itens.forEach(item-> item.produto.setQuantidade(item.produto.getQuantidade()-(int) item.getQuantidade()));

//        pedido1.itens.forEach(item -> System.out.println(item.produto.getQuantidade()));

        //Altera estado do pedido
        pedido.setEstado(Tipo.ATENDIDO);
        return true;

    }

    public void realizarvenda(List<Pedido> pedido){}

    public void consultarPreco(){ }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "local='" + local + '\'' +
                "} " + super.toString() +
                ", \npedidos=" + pedidos;
    }
}
