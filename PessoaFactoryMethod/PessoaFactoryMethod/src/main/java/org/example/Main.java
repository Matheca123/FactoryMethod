package org.example;

public class Main {
    public static void main(String[] args) {
        PessoaFactory pessoaFactory = new PessoaFactory();

        Pessoa pessoa1 = pessoaFactory.criarPessoa("Maria", 24);
        Pessoa pessoa2 = pessoaFactory.criarPessoa("João", 24);
        Pessoa pessoa3 = pessoaFactory.criarPessoa("José", 24);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}