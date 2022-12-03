package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    long matricula;
    String nome;
    String sobrenome;
    List<Disciplina> DisciplinasDoAluno = new ArrayList<>();

    public Aluno(long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

    public boolean adicionaDisciplica(Disciplina disciplina){
        this.DisciplinasDoAluno.add(disciplina);
        return true;
    }

}
