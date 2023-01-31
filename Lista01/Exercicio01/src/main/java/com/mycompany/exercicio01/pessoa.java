package com.mycompany.exercicio01;

public class pessoa {
    String nome;
    int idade;
    double altura;
    double peso;
    
    public void imprimiPessoa(){
        System.out.println("Olá, " + nome + " você tem " + idade + " anos");
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu peso é: " + peso);   
        System.out.println("=================================================");
    }
}
