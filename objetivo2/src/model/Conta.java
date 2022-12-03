package model;

public abstract class Conta {

    protected double saldo;

    public void deposita(double valor){
        this.saldo+=valor;
    }

    public void saca(double valor){

        this.saldo-=valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void atualiza(double taxa){
        taxa=1+taxa/100;
        this.saldo*=taxa;
    }
}
