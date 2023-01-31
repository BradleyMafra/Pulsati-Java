/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioencapsulamento;

/**
 *
 * @author bradley.mafra
 */
public class ExercicioEncapsulamento {

    public static void main(String[] args) {
        carro obj = new carro();
        obj.setCilindrada(3600);
        obj.setMontadora("Chevrolet");
        obj.setPaisOrigem("Japão");
        
        System.out.println(obj.getMontadora());
    }
}