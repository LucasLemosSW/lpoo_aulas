package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    long codigo;
    String nome;
    List<Aluno> alunosDaDisciplina = new ArrayList<>();

    public Disciplina(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", alunosDaDisciplina=" + alunosDaDisciplina +
                '}';
    }

    public boolean matricula(Aluno aluno){
        aluno.DisciplinasDoAluno.add(this);
//        aluno.adicionaDisciplica(this);
        this.alunosDaDisciplina.add(aluno);
        return true;
    }
}
