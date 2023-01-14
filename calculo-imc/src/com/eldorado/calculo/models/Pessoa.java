package com.eldorado.calculo.models;

public class Pessoa {
        double altura;
        double peso;
        String nome;
        char genero;
        int idade;
        double imc;
        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
        public void setAltura(String altura) {
            this.altura = Double.parseDouble(altura);
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public void setPeso(String peso) {
            this.peso = Double.parseDouble(peso);
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

        public void setGenero(String genero) {
            this.genero = genero.charAt(0);
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setIdade(String idade) {
            this.idade = Integer.parseInt(idade);
        }

        public double getImc() {
            return imc;
        }

        public void setImc(double imc) {
            this.imc = imc;
        }

    @Override
        public String toString() {
            return nome+";"+idade+";"+altura+";"+peso+";"+genero+";"+imc;
        }
}
