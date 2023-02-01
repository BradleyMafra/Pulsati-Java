package com.mycompany.exemploconstrutor;

public class ExemploConstrutor {

    public static void main(String[] args) {
        carro objCarro = new carro();
        objCarro.setMontadora("Jac");
        System.out.println("Montadora: "+ objCarro.getMontadora());
    }
}
