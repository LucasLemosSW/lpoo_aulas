package model;

public interface AssociadoVip {
//public abstract class AssociadoVip{

    double lucros(int qdeCotas, double valorCota);
    public int getCotas();

    public boolean adicionaCotas(int qdeCotas);

}
