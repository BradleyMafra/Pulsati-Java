package com.mycompany.exercicioconstrutor;

public class Contato{
    int numeroCelular;
    String email;

    Pessoa p = new Pessoa();
    Endereco e = new Endereco();
    
    
    public void imprimirP(){
        p.setNome("Bradley");
        p.setIdade(20);
        e.setRua("Rua Hilma Bruch");
        e.setNumero(250);
        e.setCep(89066255);
        
        System.out.println("Olá, "+p.getNome());
        System.out.println("Sua idade: "+p.getIdade());
        System.out.println("Seu endereço: "+e.getRua()+" "+e.getNumero()+" "+e.getCep());
    }
    
    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
