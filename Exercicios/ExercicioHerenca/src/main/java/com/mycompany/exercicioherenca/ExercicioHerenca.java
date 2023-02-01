package com.mycompany.exercicioherenca;

public class ExercicioHerenca {
    
    public static void imprimeMenssagem(Veiculo v){
        System.out.println("Quantidade de passageiros: " + v.getQuantidadeDePassageiros());
    }

    public static void main(String[] args) {
        Aviao objAviao = new Aviao() {
            @Override
            public void imprime() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Moto objMoto = new Moto() {
            @Override
            public void imprime() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        objMoto.setQuantidadeDePassageiros(2);
        objAviao.setQuantidadeDePassageiros(120);
        
        imprimeMenssagem(objMoto);
        imprimeMenssagem(objAviao);
    }
}
