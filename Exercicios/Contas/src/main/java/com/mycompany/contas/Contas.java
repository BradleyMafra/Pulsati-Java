package com.mycompany.contas;

public class Contas {
    String nomeTitular;
    double saldo;
    double numeroConta;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void depositar(){
        System.out.println("AOOOOBA"+getNomeTitular()+getNumeroConta()+getSaldo());
    }
}
