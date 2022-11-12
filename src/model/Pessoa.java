package model;

public class Pessoa {

    private long ID;
    private String corDosOlhos;
    double altura;

    public Pessoa(){

    }

    public Pessoa(long ID, String corDorOlhos, double altura){

        this.corDosOlhos = corDorOlhos;
        this.altura =altura;
    }

    public double getAltura() {
        return altura;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return ID == pessoa.ID;
    }

    @Override
    public int hashCode() {
        return (int) (ID ^ (ID >>> 32));
    }
}
