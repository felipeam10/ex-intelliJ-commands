package br.com.felipe.bank.model;

import java.time.LocalDate;

public class Gerente extends Funcionario{

    private double bonnus;
    private String usuario;
    private String senha;

    public Gerente(String name, int matricula, LocalDate dataNascimento) {
        super(name, matricula, dataNascimento);
    }

    public double getBonnus() {
        return bonnus;
    }

    public void setBonnus(double bonnus) {
        this.bonnus = bonnus;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
