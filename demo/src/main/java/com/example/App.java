package com.example;

import com.example.model.Pessoa;
import com.example.proxy.PessoaProxy;

/**
 * test Design Pattern Proxy
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        Pessoa pessoa = new Pessoa("João", "20", "Masculino");
        PessoaProxy pessoaProxy = new PessoaProxy(pessoa);
        System.out.println("Nome: " + pessoaProxy.getNome());
        System.out.println("Nome: " + pessoaProxy.getNome());
    }
}
