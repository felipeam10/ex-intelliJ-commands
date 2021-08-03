package br.com.felipe.bank.model;

import java.time.LocalDate;
import java.time.LocalDate;

public class Funcionario {

    private String          name;
    private int             matricula;
    private LocalDate       dataNascimento;

    public Funcionario(String name, int matricula, LocalDate dataNascimento) {
        this.name = name;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario { " +
                "name= '" + name + '\'' +
                ", matricula= " + matricula +
                ", dataNascimento= " + dataNascimento +
                " } ";
    }
}
