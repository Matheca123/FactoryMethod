package org.example;

public class PessoaFactory {
    private int contador = 0;

    public Pessoa criarPessoa(String nome, int idade){
        Pessoa novaPessoa = new Pessoa(contador,nome,idade);
        contador++;
        return novaPessoa;
    }
}
