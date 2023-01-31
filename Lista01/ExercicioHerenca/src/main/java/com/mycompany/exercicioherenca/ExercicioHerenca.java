package com.mycompany.exercicioherenca;

public class ExercicioHerenca {
    
    public static void imprimeMenssagem(Veiculo v){
        System.out.println("Quantidade de passageiros: " + v.getQuantidadeDePassageiros());
    }

    public static void main(String[] args) {
        Aviao objAviao = new Aviao();
        Moto objMoto = new Moto();
        objMoto.setQuantidadeDePassageiros(2);
        objAviao.setQuantidadeDePassageiros(120);
        
        imprimeMenssagem(objMoto);
        imprimeMenssagem(objAviao);
    }
}
