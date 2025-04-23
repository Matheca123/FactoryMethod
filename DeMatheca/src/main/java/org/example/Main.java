package org.example;

public class Main {
    public static void main(String[] args) {
        PessoaFactory fabrica = new PessoaFactory();

        Pessoa pessoa1 = fabrica.criarPessoa("João", 22);
        Pessoa pessoa2 = fabrica.criarPessoa("Pedro", 45);
        Pessoa pessoa3 = fabrica.criarPessoa("Kleber", 28);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}