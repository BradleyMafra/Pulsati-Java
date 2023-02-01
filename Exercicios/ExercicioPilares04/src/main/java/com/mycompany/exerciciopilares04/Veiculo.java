package com.mycompany.exerciciopilares04;

public abstract class Veiculo {
    private double velocidade;
    private int quantidePassageiros;
    
    public abstract void imprime();

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getQuantidePassageiros() {
        return quantidePassageiros;
    }

    public void setQuantidePassageiros(int quantidePassageiros) {
        this.quantidePassageiros = quantidePassageiros;
    }
}

