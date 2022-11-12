package model;

public class Caminhao extends Veiculo implements Automovel  {

    int capacidadeDeCarga;

    public Caminhao(int numeroDeeixos, String propulsao, String marca, String modelo, int anoFrabricacao, int capacidadeDeCarga) {
        super(numeroDeeixos, propulsao, marca, modelo, anoFrabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public int getNumeroDeeixos() {
        return super.getNumeroDeeixos();
    }

    @Override
    public void setNumeroDeeixos(int numeroDeeixos) {
        super.setNumeroDeeixos(numeroDeeixos);
    }

    @Override
    public String getPropulsao() {
        return super.getPropulsao();
    }

    @Override
    public void setPropulsao(String propulsao) {
        super.setPropulsao(propulsao);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public int getAnoFrabricacao() {
        return super.getAnoFrabricacao();
    }

    @Override
    public void setAnoFrabricacao(int anoFrabricacao) {
        super.setAnoFrabricacao(anoFrabricacao);
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
        return "Caminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                ", numeroDeeixos=" + numeroDeeixos +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFrabricacao=" + anoFrabricacao +
                '}';
    }
}
