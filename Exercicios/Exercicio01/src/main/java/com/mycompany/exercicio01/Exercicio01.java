package com.mycompany.exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        pessoa objeto = new pessoa();
        objeto.nome = "Bradley";
        objeto.idade = 20;
        objeto.altura = 1.98;
        objeto.peso = 86.90;
        objeto.imprimiPessoa();
        
        pessoa pessoa2 = new pessoa();
        pessoa2.nome = "Jonas";
        pessoa2.idade = 22;
        pessoa2.altura = 1.72;
        pessoa2.peso = 76.20;
        pessoa2.imprimiPessoa();
    }
}
