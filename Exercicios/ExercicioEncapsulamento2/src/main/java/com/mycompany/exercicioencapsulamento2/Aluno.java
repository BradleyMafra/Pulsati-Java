package com.mycompany.exercicioencapsulamento2;

public class Aluno {
    private String nome;
    private int nota;
    
    public void imprimirNotaEhNome(){
        System.out.println("Olá, "+getNome()+" sua nota: "+getNota());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
