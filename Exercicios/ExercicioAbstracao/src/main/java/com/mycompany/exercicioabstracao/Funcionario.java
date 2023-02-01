package com.mycompany.exercicioabstracao;

public class Funcionario extends Pessoa{
    private int cracha;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    @Override
    public void imprime() {
        System.out.println("O funcionário "+getNome()+" tem "+getIdade()+" anos e possui o cracha "+getCracha());
    }
}
