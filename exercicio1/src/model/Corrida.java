package model;

import java.util.Date;

public class Corrida {
    long id;
    String tipoPagamento;
    String detalhespagamento;
    Date dataInicio;
    double preco;
    int atribute9;

    Motorista motoristaDaCorrida = new Motorista();
    Usuario usuarioDaCorrida = new Usuario();

}
