package com.mycompany.biblioteca;

public class Biblioteca {
    
    public static void main(String[] args) {
        Livro L = new Livro();
        L.setTitulo("Descobrindo");
        L.setAutor("Bradley");
        L.setNumeroExemplares(10);
        L.setIsbn(2901);
        L.setNumPaginas(100);
        
        L.imprimeAlugarItem();
        L.DevolverItem();
    }
}
