package com.mycompany.gerenciarcontas;

public abstract class Contas {
    private String nomeTitular;
    private double saldo;
    private int numeroConta;
    
    public void depositar(double saldo){
        this.saldo += saldo;
    }
    
    public abstract void tranferir(double valor, Contas contaDestino);
    public abstract void sacar(double valor);
    
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

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
}