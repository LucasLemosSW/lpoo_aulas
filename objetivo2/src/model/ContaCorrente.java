package model;

public class ContaCorrente extends Conta implements AssociadoVip{

    private int qdeCotas;

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas*valorCota;
    }

    @Override
    public int getCotas() {
        return this.qdeCotas;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                " qdeCotas='" + qdeCotas + '\'' +
                '}';
    }

    @Override
    public boolean adicionaCotas(int qdeCotas){
        this.qdeCotas+=qdeCotas;
        return true;
    }
}
