package br.com.felipe.bank.registrador;

import br.com.felipe.bank.model.Pagamento;
import br.com.felipe.bank.model.Tipo;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamento {

    private final static List<Pagamento> psr = new ArrayList<>();

    public void registra(List<Pagamento> ps) {
        for (int i = 0; i < ps.size(); i++) {
            Pagamento p = ps.get(i);
            if (p.getTipo().equals(Tipo.CREDITO)) {
                p.setValor(p.getValor() * 1.02);
                psr.add(p);
                System.out.println("Pagamento realizado " + p);
            }
            if (p.getTipo().equals(Tipo.DEBITO)) {
                p.setValor(p.getValor() * 1.001);
                psr.add(p);
                System.out.println("Pagamento realizado " + p);
            }
            if (p.getTipo().equals(Tipo.DINHEIRO)) {
                psr.add(p);
                System.out.println("Pagamento realizado " + p);
            }
        }
        if (!psr.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (int i = 0; i < psr.size(); i++) {
                System.out.println(psr.get(i));
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }

}

