package model;

public class Bicicleta extends Veiculo{

   private int tamanhoRoda;
   private  String chassi;

    public Bicicleta(int numeroDeeixos, String propulsao, String marca, String modelo, int anoFrabricacao, int tamanhoRoda, String chassi) {
        super(numeroDeeixos, propulsao, marca, modelo, anoFrabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
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
    public String toString() {
        return "\nBicicleta{" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi='" + chassi + '\'' +
                ", numeroDeeixos=" + numeroDeeixos +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFrabricacao=" + anoFrabricacao +
                '}';
    }
}
