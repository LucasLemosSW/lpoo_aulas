package model;

public class Funcionario {
    private int matricula;
    private String nome;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Funcionario(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public boolean manterFunc(int matricula){
        return true;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
