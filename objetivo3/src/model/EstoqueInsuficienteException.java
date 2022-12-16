package model;

public class EstoqueInsuficienteException extends Exception {

    public EstoqueInsuficienteException() {
        super("Estoque insuficiente");
    }

}
