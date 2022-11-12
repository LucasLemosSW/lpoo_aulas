package controller;
import model.Pessoa;

public class PessoaController {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1L,"castanhos",180);
        Pessoa pessoa2 = new Pessoa(1L,"castanhos",180);
        imprimir(pessoa1);
        imprimir(pessoa2);

        System.out.println(pessoa1.equals(pessoa2));
        System.out.println(pessoa1.hashCode());
        System.out.println(pessoa2.hashCode());



    }

    private static void imprimir (Pessoa pessoa){
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getCorDosOlhos());

    }
}