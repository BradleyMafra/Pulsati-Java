package com.mycompany.gerenciarcontas;

public class GerenciarContas {

    public static void main(String[] args) {
        ContaEspecial ContaE = new ContaEspecial();
        ContaE.setLimite(200);
        ContaE.setSaldo(100);
        
        ContaPoupanca ContaP = new ContaPoupanca();
        ContaP.setSaldo(100);
        
        ContaE.tranferir(250, ContaP);
    }
}
