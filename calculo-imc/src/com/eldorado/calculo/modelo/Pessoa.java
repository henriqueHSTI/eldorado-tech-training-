package com.eldorado.calculo.modelo;

import java.util.Date;

public class Pessoa {

    double altura;
    double peso;
    String nome;
    char genero;
    short idade;

    public Pessoa() {}

    public Pessoa(double altura, double peso, String nome, char genero, short idade) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "altura=" + altura +
                ", peso=" + peso +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
