package com.mycompany.contas;

public abstract class GerenciarContas {
    
    public static void main(String[] args) {
        ContaEspecial contaE = new ContaEspecial();
        Contas C = new Contas();
                
        C.setNomeTitular("Bradley");
        C.setNumeroConta(123457);
        C.setSaldo(1000);
        contaE.setLimite(100);
        
        C.depositar();
    }
}
