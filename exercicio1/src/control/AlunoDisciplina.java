package control;

import model.Aluno;
import model.Disciplina;

public class AlunoDisciplina {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(25484,"Lucas","Lemos");
        Aluno a2 = new Aluno(98495,"Gustavo", "Loper");

        Disciplina d1 = new Disciplina(54,"Matematica");
        Disciplina d2 = new Disciplina(55,"Portugues");
        Disciplina d3 = new Disciplina(56,"Geografia");

        d1.matricula(a1);
        d2.matricula(a1);

        d1.matricula(a2);
        d2.matricula(a2);
        d3.matricula(a2);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}