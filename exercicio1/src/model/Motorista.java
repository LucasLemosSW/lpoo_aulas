package model;

import java.util.List;

public class Motorista {

    long id;
    String nome;
    String email;
    String telefone;

    Veiculo veiculoDaCorrida = new Veiculo();
    List<Corrida> Corridas;

}
