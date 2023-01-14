package com.eldorado.calculo.modelo;

import com.eldorado.calculo.utilidades.Utilidades;

public class Pessoa implements Comparable<Pessoa> {

    String nome;

    Double altura;

    Integer idade;

    Double peso;

    String genero;

    Double imc;

    public double getAltura() {
        return altura;
    }

    public void setAltura(final double altura) {
        this.altura = altura;
    }

    public void setAltura(final String altura) {
        this.altura = Utilidades.lerValorDoubleUsuario(altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(final double peso) {
        this.peso = peso;
    }

    public void setPeso(final String peso) {
        this.peso = Utilidades.lerValorDoubleUsuario(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(final String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(final Integer idade) {
        this.idade = idade;
    }

    public void setIdade(final String idade) {
        this.idade = Utilidades.lerIntegerUsuario(idade);
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(final Double imc) {
        this.imc = imc;
    }

    public void setImc(final String imc) {
        this.imc = Utilidades.lerValorDoubleUsuario(imc);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s;%s;%s", nome, altura, idade, peso, genero, imc);
    }

    @Override
    public int compareTo(final Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }
}
