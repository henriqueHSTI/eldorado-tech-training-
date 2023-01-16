package com.eldorado.calculo.modelo;


public class Pessoa {

    Double altura;
    Double peso;
    String nome;
    String genero;
    Integer idade;

    public Pessoa() {
    }

    public Pessoa(Double altura, Double peso, String nome, String genero, Integer idade) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "altura=" + altura +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}