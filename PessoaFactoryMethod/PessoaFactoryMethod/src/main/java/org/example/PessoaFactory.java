package org.example;

public class PessoaFactory {
    private int id = 0;

    public Pessoa criarPessoa(String nome, int idade) {
        Pessoa pessoa = new Pessoa(nome, idade);
        pessoa.setId(id);
        id++;

        return pessoa;
    }
}
