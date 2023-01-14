package com.eldorado.calculo.modelo;

import com.eldorado.calculo.utilidades.Utilidades;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

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
        this.altura = Utilidades.lerValorDoubleUsuario(altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setPeso(String peso) {
        this.peso = Utilidades.lerValorDoubleUsuario(peso);
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

    @Override
    public int compareTo(Pessoa o) {
        return nome.compareTo(o.getNome());
    }

}
