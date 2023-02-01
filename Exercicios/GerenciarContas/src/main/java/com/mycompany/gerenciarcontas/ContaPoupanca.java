package com.mycompany.gerenciarcontas;

public class ContaPoupanca extends Contas{
    private double taxaRendimento;
    
    @Override
    public void tranferir(double valor, Contas contaDestino) {
        if(this.getSaldo() >= valor){
            contaDestino.depositar(valor);
            this.sacar(valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void sacar(double valor) {
        if(this.getSaldo() >= valor){
            this.sacar(valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    
    }
    
}
