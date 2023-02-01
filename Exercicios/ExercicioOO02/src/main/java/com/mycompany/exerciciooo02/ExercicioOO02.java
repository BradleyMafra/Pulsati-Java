package com.mycompany.exerciciooo02;

public class ExercicioOO02 {
    
    
    public static void verificar(Mamiferos M,Cachorro C, Macaco Maca, Homem H){
        
            if(M.especie == "Cachorro"){
            System.out.println("O mamiferos escolhido foi: "+ C);
            System.out.println("Ele possui "+ C.cauda+ " cauda.");
        }
    }

    public static void main(String[] args) {
        Mamiferos M = new Mamiferos();
        M.especie = "Cachorro";
    }
}
