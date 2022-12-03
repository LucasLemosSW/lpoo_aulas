package control;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cooperativa {
    public static void main(String[] args) {

        //  A)
        System.out.println("\nQuestão A");
        ContaPoupanca contaPoupanca_1 = new ContaPoupanca();
        ContaPoupanca contaPoupanca_2 = new ContaPoupanca();
        ContaPoupanca contaPoupanca_3 = new ContaPoupanca();

        ContaCorrente contaCorrente_1 = new ContaCorrente();
        ContaCorrente contaCorrente_2 = new ContaCorrente();
        ContaCorrente contaCorrente_3 = new ContaCorrente();

        Associado associado_1 = new Associado("Joao");
        Associado associado_2 = new Associado("Francisco");
        Associado associado_3 = new Associado("Lucas");


        contaPoupanca_1.deposita(100);
        contaPoupanca_2.deposita(200);
        contaPoupanca_3.deposita(300);

        contaCorrente_1.deposita(150);
        contaCorrente_2.deposita(250);
        contaCorrente_3.deposita(350);

        System.out.println(contaPoupanca_1);
        System.out.println(contaPoupanca_2);
        System.out.println(contaPoupanca_3);

        System.out.println(contaCorrente_1);
        System.out.println(contaCorrente_2);
        System.out.println(contaCorrente_3);

        System.out.println(associado_1);
        System.out.println(associado_2);
        System.out.println(associado_3);

        //  B)
        System.out.println("\nQuestão B");
        List<Conta> contas = new ArrayList<>();
        contas.add(contaPoupanca_1);
        contas.add(contaPoupanca_2);
        contas.add(contaPoupanca_3);
        contas.add(contaCorrente_1);
        contas.add(contaCorrente_2);
        contas.add(contaCorrente_3);

        List<AssociadoVip> associadosVIP = new ArrayList<>();
        associadosVIP.add(contaCorrente_1);
        associadosVIP.add(contaCorrente_2);
        associadosVIP.add(contaCorrente_3);
        associadosVIP.add(associado_1);
        associadosVIP.add(associado_2);
        associadosVIP.add(associado_3);

        System.out.println(contas);
        System.out.println(associadosVIP);

        //  C)
        System.out.println("\nQuestão C");
        contaPoupanca_1.deposita(1000);
        contaPoupanca_1.atualiza(5);
        contaPoupanca_1.saca(50);

        System.out.println(contaPoupanca_1);

        //  D)
        System.out.println("\nQuestão D");
        contaCorrente_1.deposita(500);
        contaCorrente_1.saca(400);

        System.out.println(contaCorrente_1);

        //  E)
        System.out.println("\nQuestão E");
        contaCorrente_1.adicionaCotas(100);
        contaCorrente_2.adicionaCotas(400);
        contaCorrente_3.adicionaCotas(600);
        associado_1.adicionaCotas(300);
        associado_2.adicionaCotas(600);
        associado_3.adicionaCotas(600);

        System.out.println(associadosVIP);

        //  F)
        System.out.println("\nQuestão F");
        System.out.println("\nAssociados em ordem decrescente de QdeCotas");
        System.out.println(associadosVIP.stream().sorted(Comparator.comparing(AssociadoVip::getCotas).reversed()).collect(Collectors.toList()));
        System.out.println("\nAssociados com maior numero de cotas");
//        System.out.println(associadosVIP.stream().max(Comparator.comparing(AssociadoVip::getCotas)));
        System.out.println(associadosVIP.stream().filter(o -> String.valueOf(o.getCotas()).equals(String.valueOf(
                associadosVIP.stream().max(Comparator.comparing(AssociadoVip::getCotas)).get().getCotas()
        ))).toList());

        //  G)
        System.out.println("\nQuestão G");
        System.out.println("\nContas em ordem decrescente de QdeCotas");
        System.out.println(contas.stream().sorted(Comparator.comparing(Conta::getSaldo).reversed()).collect(Collectors.toList()));

        System.out.println("\nContas com maior Saldo");
//        System.out.println(contas.stream().max(Comparator.comparing(Conta::getSaldo)));
        System.out.println(contas.stream().filter(o -> String.valueOf(o.getSaldo()).equals(
                String.valueOf(contas.stream().max(Comparator.comparing(Conta::getSaldo)).get().getSaldo()))).toList());












    }
}