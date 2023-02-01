package com.mycompany.biblioteca;

public abstract class Item {
    private String titulo;
    private String autor;
    private int numeroExemplares;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }

    public void setNumeroExemplares(int numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }
     
    public void imprimeAlugarItem(){
        System.out.println(getTitulo()+" foi alugado");
    }
    
    public void DevolverItem(){
        System.out.println(getTitulo()+" foi devoldido");
    }
}
