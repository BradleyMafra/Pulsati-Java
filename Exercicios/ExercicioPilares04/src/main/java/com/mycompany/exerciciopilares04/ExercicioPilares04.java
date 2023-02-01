package com.mycompany.exerciciopilares04;

public class ExercicioPilares04 {
    
    public static void imprimirT(Aviao A, Moto M){
        A.imprime();
        M.imprime();
    }
    
    public static void main(String[] args) {
        Moto M = new Moto();
        Aviao A = new Aviao();
        
        
        M.setQuantidadeAcentos(1);
        M.setQuantidadeRetovisores(2);
        M.setQuantidePassageiros(2);
        M.setVelocidade(410);
        
        A.setQuantidadeAcentos(120);
        A.setQuantidePassageiros(120);
        A.setQuantidadeJanelas(240);
        A.setVelocidade(600);
        
        imprimirT(A, M);
        
    }
}
