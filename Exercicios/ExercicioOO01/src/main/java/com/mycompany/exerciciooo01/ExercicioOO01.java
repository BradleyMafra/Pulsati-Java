package com.mycompany.exerciciooo01;

public class ExercicioOO01 {
    
    public static void imprimirT(ContaEspecial C){
        System.out.println("Olá, " + C.getCliente() + " o número da sua conta é: " + C.getNumero());
        System.out.println("Seu limite é: " + C.getLimite());
        System.out.println("Seu saldo é: " + C.getSaldo());
    }
    
    public static void main(String[] args) {
        ContaEspecial cS = new ContaEspecial();
        cS.setCliente("Bradley");
        cS.setLimite(1000);
        cS.setNumero("123871-7");
        cS.setSaldo(15000);
        
        imprimirT(cS);
    }
}
