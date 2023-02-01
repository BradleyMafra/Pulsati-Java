package com.mycompany.exercicioherenca;

public abstract class Veiculo {
       private double velocidade;
       private int quantidadeDePassageiros;
      
    public abstract void imprime();

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }

    public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }
}
