package com.mycompany.exercicio02;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        computador pc = new computador();
        pc.processador = "Ryzen7";
        pc.memoria = 8;
        pc.imprimirComputador();
        
        computador pc2 = new computador();
        pc.processador = "Intel i9";
        pc.memoria = 24;
        pc.imprimirComputador();
    }
}
