package com.eldorado.calculo.modelo;

public class Pessoa {

    double altura;
    double peso;
    String nome;
    String genero;
    int idade;


    public double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void setAltura(String altura) {
        this.altura = Double.valueOf(altura);
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
    public void setIdade(String idade) {
        this.idade = Integer.valueOf(idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "altura=" + altura +
                ", peso=" + peso +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }
}
