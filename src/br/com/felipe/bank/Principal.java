package br.com.felipe.bank;

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
        new OpcoesPagamento().mensagemDeBoasVindas();
    }
}
