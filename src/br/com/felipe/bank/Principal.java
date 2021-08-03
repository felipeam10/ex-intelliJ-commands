package br.com.felipe.bank;

import br.com.felipe.bank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello intelliJ Ideia");
        Funcionario jose = new Funcionario("Jose", 1, LocalDate.of(1990, 2, 10));
        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(1991, 3, 11));
        System.out.println(jose);
        System.out.println(maria);
    }
}
