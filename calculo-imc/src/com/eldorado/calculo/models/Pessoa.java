package com.eldorado.calculo.models;

public class Pessoa {
        double altura;
        double peso;
        String nome;
        char genero;
        int idade;

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

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "Altura=" + altura +
                    ", Peso=" + peso +
                    ", Nome='" + nome + '\'' +
                    ", Genero=" + genero +
                    ", Idade=" + idade +
                    '}';
        }
}
