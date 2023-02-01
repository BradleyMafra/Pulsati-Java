package com.mycompany.exercicio05;

public class Exercicio05 {

    public static void main(String[] args) {
        carro c1 = new carro();
        c1.litrosTanque = 20;
        c1.montadora = "Chevrolet";
        c1.imprimiCarro();
        
        carro c2 = new carro();
        c2.litrosTanque = 35;
        c2.montadora = "Mercedes";
        c2.imprimiCarro();
    }
}
