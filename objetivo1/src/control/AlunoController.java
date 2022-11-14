package control;

import model.Aluno;

import java.util.*;
import java.util.stream.Collectors;

public class AlunoController {
    public static void main(String[] args) {
        //padrão
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //nome e cpf
        Aluno aluno3 = new Aluno(204586,"Lucas");
        Aluno aluno4 = new Aluno(841546,"José");

        //Completo
        Aluno aluno5 = new Aluno(5,204586,"Lucas","lemos","lemos@gmail.com");
        Aluno aluno6 = new Aluno(6,841546,"José","Da Silva","jose@gmail.com");

        //Objetivo1

        //1)
        //A)
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        //B)
        aluno1.setId(1);
        aluno1.setCpf(2846487);
        aluno1.setNome("Sergio");
        aluno1.setSobrenome("Cavalcante");
        aluno1.setEmail("sergio@gmail.com");

        aluno2.setId(2);
        aluno2.setCpf(8495156);
        aluno2.setNome("Gustavo");
        aluno2.setSobrenome("Loper");
        aluno2.setEmail("gustavo@gmail.com");

        System.out.println(" ID: " + aluno1.getId() +
                " CPF: " + aluno1.getCpf() +
                " Nome: " + aluno1.getNome() +
                " Sobrenome: " + aluno1.getSobrenome() +
                " Email: " + aluno1.getEmail());

        System.out.println(" ID: " + aluno2.getId() +
                " CPF: " + aluno2.getCpf() +
                " Nome: " + aluno2.getNome() +
                " Sobrenome: " + aluno2.getSobrenome() +
                " Email: " + aluno2.getEmail());

        //2)
        List<Aluno> AlunosList = new ArrayList<>();
        AlunosList.add(aluno1);
        AlunosList.add(aluno2);
        AlunosList.add(aluno3);
        AlunosList.add(aluno4);
        AlunosList.add(aluno5);
        AlunosList.add(aluno6);

        aluno3.setId(3);
        aluno4.setId(4);

        System.out.println("imprimindo Usando List");
        System.out.println(AlunosList.stream().sorted(Comparator.comparing(Aluno::getId)).collect(Collectors.toList()));

        System.out.println(AlunosList.stream().filter(p -> p.getId() == 5).collect(Collectors.toList()));

        AlunosList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(AlunosList);

        System.out.println("imprimindo Usando Map");

        Map<Aluno, Integer> AlunosMap = new HashMap<Aluno, Integer>();

        AlunosMap.put(aluno1, 0);
        AlunosMap.put(aluno2, 1);
        AlunosMap.put(aluno3, 2);
        AlunosMap.put(aluno4, 3);
        AlunosMap.put(aluno5, 4);
        AlunosMap.put(aluno6, 5);

        System.out.println(AlunosMap.);





    }
}