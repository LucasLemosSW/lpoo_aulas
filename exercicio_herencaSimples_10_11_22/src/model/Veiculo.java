package model;

public abstract class Veiculo{

    protected int numeroDeeixos;
    protected String propulsao;
    protected String marca;
    protected String modelo;
    protected int anoFrabricacao;

    public Veiculo(int numeroDeeixos, String propulsao, String marca, String modelo, int anoFrabricacao) {
        this.numeroDeeixos = numeroDeeixos;
        this.propulsao = propulsao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFrabricacao = anoFrabricacao;
    }

    public int getNumeroDeeixos() {
        return numeroDeeixos;
    }

    public void setNumeroDeeixos(int numeroDeeixos) {
        this.numeroDeeixos = numeroDeeixos;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public void setPropulsao(String propulsao) {
        this.propulsao = propulsao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFrabricacao() {
        return anoFrabricacao;
    }

    public void setAnoFrabricacao(int anoFrabricacao) {
        this.anoFrabricacao = anoFrabricacao;
    }
}
