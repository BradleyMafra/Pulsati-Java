package com.mycompany.exercicioherenca;

public abstract class Aviao extends Veiculo {
    private int quantidadePortas;
    private int quantidadeJanela;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadeJanela() {
        return quantidadeJanela;
    }

    public void setQuantidadeJanela(int quantidadeJanela) {
        this.quantidadeJanela = quantidadeJanela;
    }
}
