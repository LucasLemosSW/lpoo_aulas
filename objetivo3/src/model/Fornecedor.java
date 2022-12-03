package model;

public class Fornecedor {

    private int cnpj;
    private String contato;
    private String nome;

    Produto produto;
    Fornecimento fornecimento;

    public boolean manterFornec(int cnpj){
        return true;
    }

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
