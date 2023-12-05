package com.example.proxy;

import com.example.model.Pessoa;

public class PessoaProxy extends Pessoa {
    private Pessoa pessoa;
    private String nome;
    private String idade;
    private String sexo;

    public PessoaProxy(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String getNome() throws InterruptedException {
        if (nome == null) {
            nome = pessoa.getNome();
        }
        return nome;
    }

    @Override
    public String getIdade() throws InterruptedException {
        if (idade == null) {
            idade = pessoa.getIdade();
        }
        return idade;
    }

    @Override
    public String getSexo() throws InterruptedException {
        if (sexo == null) {
            sexo = pessoa.getSexo();
        }
        return sexo;
    }
}
