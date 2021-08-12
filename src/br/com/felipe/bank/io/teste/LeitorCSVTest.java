package br.com.felipe.bank.io.teste;

import br.com.felipe.bank.io.LeitorCSV;
import br.com.felipe.bank.model.Pagamento;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeitorCSVTest {

    @Test
     void lerPagamentosDeAbril() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);
        assertEquals(5, pagamentos.size());
    }

    @Test
     void lerPagamentosDeMaio() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(3);
        assertEquals(5, pagamentos.size());
    }

    @Test
     void lerPagamentosDeJunho() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(2);
        assertEquals(5, pagamentos.size());
    }
}