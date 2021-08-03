package br.com.felipe.bank;

import br.com.felipe.bank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello intelliJ Ideia");
        Funcionario jose = new Funcionario();
        jose.setName("Jose");
        jose.setMatricula(1);
        jose.setDataNascimento(LocalDate.of(1990,2,10));
        System.out.println(jose);
    }
}
