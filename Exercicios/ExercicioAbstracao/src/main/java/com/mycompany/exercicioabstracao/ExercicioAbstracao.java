package com.mycompany.exercicioabstracao;

public class ExercicioAbstracao {

    public static void imprimePessoa(Pessoa param) {
        param.imprime();
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Cliente c = new Cliente();
        
        c.setNome("Natan");
        c.setIdade(21);
        c.setCodigoCliente(25534);
        
        f.setNome("Bradley");
        f.setIdade(20);
        f.setCracha(1);
        imprimePessoa(c);
        imprimePessoa(f);
    }
}
