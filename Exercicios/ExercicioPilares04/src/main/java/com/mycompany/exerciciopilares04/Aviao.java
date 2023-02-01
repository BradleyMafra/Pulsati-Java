package com.mycompany.exerciciopilares04;

public class Aviao extends Veiculo{
    private int quantidadeAcentos;
    private int quantidadeJanelas;

    public int getQuantidadeAcentos() {
        return quantidadeAcentos;
    }

    public void setQuantidadeAcentos(int quantidadeAcentos) {
        this.quantidadeAcentos = quantidadeAcentos;
    }

    public int getQuantidadeJanelas() {
        return quantidadeJanelas;
    }

    public void setQuantidadeJanelas(int quantidadeJanelas) {
        this.quantidadeJanelas = quantidadeJanelas;
    }
    @Override
    public void imprime() {
        System.out.println("O avião tem "+getQuantidadeAcentos()+" acentos e "+getQuantidadeJanelas()+" e cabe "+getQuantidePassageiros()+" e sua velocidade maxima é "+getVelocidade());
    }
}
