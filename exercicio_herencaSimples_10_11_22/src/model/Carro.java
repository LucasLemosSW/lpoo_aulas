package model;

public class Carro extends Veiculo implements Automovel{

    int capacidadePortaMalas;



    public Carro(int numeroDeeixos, String propulsao, String marca, String modelo, int anoFrabricacao, int capacidadePortaMalas) {
        super(numeroDeeixos, propulsao, marca, modelo, anoFrabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }


    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String getRenavam() {
        return null;
    }

    @Override
    public void setRenavam(String renavam) {

    }

    @Override
    public String getChassi() {
        return null;
    }

    @Override
    public void setChassi(String chassi) {

    }

    @Override
    public String getPlaca() {
        return null;
    }

    @Override
    public void setPlaca(String placa) {

    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                ", numeroDeeixos=" + numeroDeeixos +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFrabricacao=" + anoFrabricacao +
                '}';
    }
}
