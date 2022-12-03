package model;

public class Associado implements AssociadoVip{
    private String nome;
    private int qdeCotas;

    public Associado(String nome) {
        this.nome = nome;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas*valorCota;
    }

    @Override
    public int getCotas() {
        return this.qdeCotas;
    }

    @Override
    public boolean adicionaCotas(int qdeCotas){
        this.qdeCotas+=qdeCotas;
        return true;
    }

    @Override
    public String toString() {
        return "\nAssociado{" +
                "nome='" + nome + '\'' +
                " qdeCotas='" + qdeCotas + '\'' +
                '}';
    }
}
