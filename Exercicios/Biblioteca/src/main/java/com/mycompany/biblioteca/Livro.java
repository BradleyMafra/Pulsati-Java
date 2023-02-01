package com.mycompany.biblioteca;

public class Livro extends Item{
    private int isbn;
    private int numPaginas;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
     
    public void imprimeAlugarItem(){
        System.out.println(getTitulo()+" foi alugado");
    }
}
