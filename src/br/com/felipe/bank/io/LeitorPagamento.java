package br.com.felipe.bank.io;

import br.com.felipe.bank.model.Pagamento;

import java.io.IOException;
import java.util.List;

public interface LeitorPagamento {
    List<Pagamento> ler(int codigo) throws IOException;
}
