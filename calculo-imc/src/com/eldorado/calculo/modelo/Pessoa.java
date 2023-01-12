package com.eldorado.calculo.modelo;

public class Pessoa {

    double altura;

    double peso;

    String nome;

    char genero;

    short idade;

    public double getAltura() {
        return altura;
    }

    public void setAltura(final double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(final double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(final char genero) {
        this.genero = genero;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(final short idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "altura=" + altura +
                ", peso=" + peso +
                ", nome='" + nome + '\'' +
                ", genero=" + genero +
                ", idade=" + idade +
                '}';
    }
}
