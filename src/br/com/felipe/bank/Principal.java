package br.com.felipe.bank;

import br.com.felipe.bank.model.Funcionario;
import br.com.felipe.bank.model.Pagamento;
import br.com.felipe.bank.model.Tipo;
import br.com.felipe.bank.registrador.RegistroDePagamento;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello intelliJ Ideia");
        Funcionario jose = new Funcionario("Jose", 1, LocalDate.of(1990, 2, 10));
        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(1991, 3, 11));
        System.out.println(jose);
        System.out.println(maria);

        Pagamento almoco = new Pagamento(Tipo.DEBITO, 20, "Almoço no feijuca");
        Pagamento videogame = new Pagamento(Tipo.CREDITO, 1000, "PS4");

        List<Pagamento> pagamentos = Arrays.asList(almoco, videogame);

        RegistroDePagamento registrador = new RegistroDePagamento();
        registrador.registra(pagamentos);
    }
}
