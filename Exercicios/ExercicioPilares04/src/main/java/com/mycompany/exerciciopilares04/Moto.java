package com.mycompany.exerciciopilares04;

public class Moto extends Veiculo{
    private int quantidadeRetovisores;
    private int quantidadeAcentos;

    public int getQuantidadeRetovisores() {
        return quantidadeRetovisores;
    }

    public void setQuantidadeRetovisores(int quantidadeRetovisores) {
        this.quantidadeRetovisores = quantidadeRetovisores;
    }

    public int getQuantidadeAcentos() {
        return quantidadeAcentos;
    }

    public void setQuantidadeAcentos(int quantidadeAcentos) {
        this.quantidadeAcentos = quantidadeAcentos;
    }
    public void imprime(){
        System.out.println("O moto tem "+getQuantidadeAcentos()+" acentos e "+getQuantidadeRetovisores()+" e cabe "+getQuantidePassageiros()+" e sua velocidade maxima é "+getVelocidade());
    }
}
