package br.com.felipe.bank.servico;

import br.com.felipe.bank.model.Pagamento;
import br.com.felipe.bank.registrador.RegistroDePagamento;
import br.com.felipe.bank.validador.ValidaPagamento;

import java.util.List;

public class ServicoPagamento {

    RegistroDePagamento registro = new RegistroDePagamento();

    public void registra(List<Pagamento> pagamentos) {
        ValidaPagamento validador = new ValidaPagamento();
        validador.verificaTipo(pagamentos);
        registro.registra(pagamentos);
    }

    public void exibePgtoEfetuados() {
        registro.exibePgtoEfetuados();
    }
}
