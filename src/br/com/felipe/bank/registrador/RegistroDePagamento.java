package br.com.felipe.bank.registrador;

import br.com.felipe.bank.model.Pagamento;
import br.com.felipe.bank.validador.ValidaPagamento;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamento {

    private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();

    public void registra(List<Pagamento> pagamentos) {
        for (Pagamento pagamento : pagamentos) {
            salva(pagamento);
        }
        exibePgtoEfetuados();
    }

    public void exibePgtoEfetuados() {
        if (!PAGAMENTOS.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (Pagamento pagamento : PAGAMENTOS) {
                System.out.println(pagamento);
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }

    private void salva(Pagamento pagamento) {
        PAGAMENTOS.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }

}

