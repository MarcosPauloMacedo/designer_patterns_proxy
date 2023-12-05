package com.example.model;

public class Pessoa {
    private String nome;
    private String idade;
    private String sexo;

    public Pessoa(String nome, String idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa() {
    }

    public String getNome() throws InterruptedException{
        demorarResposta();
        return nome;
    }

    public String getIdade() throws InterruptedException {
        demorarResposta();
        return idade;
    }

    public String getSexo() throws InterruptedException {
        demorarResposta();
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private void demorarResposta() throws InterruptedException {
        Thread.sleep(5000);
    }
}
