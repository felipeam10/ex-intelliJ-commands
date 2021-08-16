package br.com.felipe.bank;

import br.com.felipe.bank.io.LeitorCSV;
import br.com.felipe.bank.io.LeitorXML;
import br.com.felipe.bank.model.Funcionario;
import br.com.felipe.bank.model.Pagamento;
import br.com.felipe.bank.model.Tipo;
import br.com.felipe.bank.registrador.RegistroDePagamento;
import br.com.felipe.bank.visualizador.OpcoesPagamento;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
//      new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(1);

        for (Pagamento pagamento:
             pagamentos) {

            double valorBruto = pagamento.getValor();

            if (valorBruto > 100) {
                double valorComAcrescimo = valorBruto * 1.1;
                pagamento.setValor(valorComAcrescimo);
            }

            System.out.println(pagamento);

        }

    }
}
