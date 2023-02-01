package com.mycompany.exercicioherenca;

public abstract class Moto extends Veiculo{
     private double comprimentoGuidao;
     private int quantidadeRetrovisor;

    public double getComprimentoGuidao() {
        return comprimentoGuidao;
    }

    public void setComprimentoGuidao(double comprimentoGuidao) {
        this.comprimentoGuidao = comprimentoGuidao;
    }

    public int getQuantidadeRetrovisor() {
        return quantidadeRetrovisor;
    }

    public void setQuantidadeRetrovisor(int quantidadeRetrovisor) {
        this.quantidadeRetrovisor = quantidadeRetrovisor;
    }
}
